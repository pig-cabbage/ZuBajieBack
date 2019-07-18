package com.zubajie.service.impl;

import com.zubajie.dao.OrderMapper;
import com.zubajie.entity.Order;
import com.zubajie.service.DisplayOrderByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayOrderByUserIdServiceimpl implements DisplayOrderByUserIdService {
    @Autowired
    private OrderMapper orderMapper;

    //展示用户的订单
    @Override
    public List<Order> displayOrderByUserId(Integer userId){
        List<Order> allList=orderMapper.selectAll();
        List<Order> orderList=new ArrayList<>();
        for(int i=0;i<allList.size();++i){
            if(allList.get(i).getBuyerId().equals(userId)||allList.get(i).getSalerId().equals(userId))
                orderList.add(allList.get(i));
        }
        return orderList;

    }
}
