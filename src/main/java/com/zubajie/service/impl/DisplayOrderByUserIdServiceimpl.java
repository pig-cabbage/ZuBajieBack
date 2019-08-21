package com.zubajie.service.impl;

import com.zubajie.dao.BorrowGoodsMapper;
import com.zubajie.dao.LendGoodsMapper;
import com.zubajie.dao.OrderMapper;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.entity.Order;
import com.zubajie.service.AndroidEntity.AndroidOrder;
import com.zubajie.service.DisplayOrderByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayOrderByUserIdServiceimpl implements DisplayOrderByUserIdService {
    @Autowired
    private OrderMapper orderMapper;
    @Autowired
    private BorrowGoodsMapper borrowGoodsMapper;
    @Autowired
    private LendGoodsMapper lendGoodsMapper;

    //展示用户的订单
    @Override
    public List<AndroidOrder> displayOrderByUserId(Integer userId){
        List<Order> allList=orderMapper.selectAll();
        List<Order> orderList=new ArrayList<>();
        List<AndroidOrder>result=new ArrayList<>();
        for(int i=0;i<allList.size();++i){
            if(allList.get(i).getBuyerId().equals(userId)||allList.get(i).getSalerId().equals(userId))
                orderList.add(allList.get(i));
        }
        for(int k=0;k<orderList.size();++k){
            AndroidOrder item = new AndroidOrder();
            if(borrowGoodsMapper.selectByPrimaryKey(orderList.get(k).getGoodsId())!=null) {

                item.setOrderId(orderList.get(k).getOrderId());
                item.setGoodsId(orderList.get(k).getGoodsId());
                item.setOrderState(orderList.get(k).getOrderState());
                item.setBorrow(true);
                item.setPrice(borrowGoodsMapper.selectByPrimaryKey(orderList.get(k).getGoodsId()).getPrice());
                item.setTitle(borrowGoodsMapper.selectByPrimaryKey(orderList.get(k).getGoodsId()).getTitle());
                item.setTime(orderList.get(k).getTime());
            }else{

                item.setOrderId(orderList.get(k).getOrderId());
                item.setGoodsId(orderList.get(k).getGoodsId());
                item.setOrderState(orderList.get(k).getOrderState());
                item.setBorrow(false);
                item.setPrice(lendGoodsMapper.selectByPrimaryKey(orderList.get(k).getGoodsId()).getPrice());
                item.setTitle(lendGoodsMapper.selectByPrimaryKey(orderList.get(k).getGoodsId()).getTitle());
                item.setTime(orderList.get(k).getTime());
            }
            result.add(item);

        }
        return result;

    }

}
