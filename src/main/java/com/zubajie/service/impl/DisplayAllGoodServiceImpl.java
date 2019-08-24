package com.zubajie.service.impl;

import com.zubajie.dao.*;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.DisplayAllGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayAllGoodServiceImpl implements DisplayAllGoodService {

    @Autowired
    private LendGoodsMapper lendGoodsMapper;
    @Autowired
    private BorrowGoodsMapper borrowGoodsMapper;
    @Autowired
    private LendPictureMapper lendPictureMapper;
    @Autowired
    private BorrowPictureMapper borrowPictureMapper;
    @Autowired
    private UserMapper userMapper;


    @Override
    public List<Item> displayLendGoods() {
        List<LendGoods> lendGoodsList=lendGoodsMapper.selectAll();
        List<Item>result=new ArrayList<>();
        for(int i=0;i<lendGoodsList.size();++i){
            if(lendGoodsList.get(i).getState()==true){
                Item item=new Item();
                item.setGoodId(lendGoodsList.get(i).getLendId());
                item.setTitle(lendGoodsList.get(i).getTitle());
                item.setDescription(lendGoodsList.get(i).getDescription());
                item.setUserId(lendGoodsList.get(i).getUserId());
                item.setCreateTime(lendGoodsList.get(i).getCreateTime());
                item.setValidity(lendGoodsList.get(i).getPeriodOfValidity());
                item.setImageList(lendPictureMapper.findByGoodId(lendGoodsList.get(i).getLendId()));
                System.out.println(lendGoodsList.get(i).getLendId()+"啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
                item.setUserImage(userMapper.selectByPrimaryKey(lendGoodsList.get(i).getUserId()).getHeadPortrait());
                item.setTag(lendGoodsList.get(i).getTag());
                item.setViewCount(lendGoodsList.get(i).getViewCount());
                item.setBorrow(false);
                item.setPrice(lendGoodsList.get(i).getPrice());
                result.add(item);
            }
        }
        return result;
    }
    @Override
    public List<Item>displayBorrowGoods(){
        List<BorrowGoods> borrowGoodsList=borrowGoodsMapper.selectAll();
        List<Item>result=new ArrayList<>();
        for(int i=0;i<borrowGoodsList.size();++i){
            if(borrowGoodsList.get(i).getState()==true){
                Item item=new Item();
                item.setGoodId(borrowGoodsList.get(i).getBorrowId());
                item.setTitle(borrowGoodsList.get(i).getTitle());
                item.setDescription(borrowGoodsList.get(i).getDescription());
                item.setUserId(borrowGoodsList.get(i).getUserId());
                item.setCreateTime(borrowGoodsList.get(i).getCreateTime());
                item.setValidity(borrowGoodsList.get(i).getPeriodOfValidity());
                item.setImageList(borrowPictureMapper.findByGoodId(borrowGoodsList.get(i).getBorrowId()));
                item.setUserImage(userMapper.selectByPrimaryKey(borrowGoodsList.get(i).getUserId()).getHeadPortrait());
                item.setTag(borrowGoodsList.get(i).getTag());
                item.setViewCount(borrowGoodsList.get(i).getViewCount());
                item.setBorrow(true);
                item.setPrice(borrowGoodsList.get(i).getPrice());
                result.add(item);
            }
        }
        return result;
    }


}
