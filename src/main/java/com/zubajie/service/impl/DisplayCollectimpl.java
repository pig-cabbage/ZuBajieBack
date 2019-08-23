package com.zubajie.service.impl;

import com.zubajie.dao.*;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.Collect;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.DisplayCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayCollectimpl implements DisplayCollectService {

    @Autowired
    private CollectMapper collectMapper;
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
    public List<Item> disCollect(Integer userId){
        List<Item>result=new ArrayList<>();
        List<Collect>all=collectMapper.selectAll();
        for(int i=0;i<all.size();++i){
            if(all.get(i).getUserId().equals(userId)){
                if(all.get(i).getGoodsId()>0){
                    LendGoods temp=lendGoodsMapper.selectByPrimaryKey(all.get(i).getGoodsId());
                    Item item=new Item();
                    item.setGoodId(temp.getLendId());
                    item.setTitle(temp.getTitle());
                    item.setDescription(temp.getDescription());
                    item.setUserId(temp.getUserId());
                    item.setCreateTime(temp.getCreateTime());
                    item.setValidity(temp.getPeriodOfValidity());
                    item.setImageList(lendPictureMapper.findByGoodId(temp.getLendId()));
                    System.out.println(temp.getLendId()+"啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
                    item.setUserImage(userMapper.selectByPrimaryKey(temp.getUserId()).getHeadPortrait());
                    item.setTag(temp.getTag());
                    item.setViewCount(temp.getViewCount());
                    item.setBorrow(false);
                    item.setPrice(temp.getPrice());
                    result.add(item);
                }else{
                    BorrowGoods temp=borrowGoodsMapper.selectByPrimaryKey(all.get(i).getGoodsId());
                    Item item=new Item();
                    item.setGoodId(temp.getBorrowId());
                    item.setTitle(temp.getTitle());
                    item.setDescription(temp.getDescription());
                    item.setUserId(temp.getUserId());
                    item.setCreateTime(temp.getCreateTime());
                    item.setValidity(temp.getPeriodOfValidity());
                    item.setImageList(borrowPictureMapper.findByGoodId(temp.getBorrowId()));
                    System.out.println(temp.getBorrowId()+"啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
                    item.setUserImage(userMapper.selectByPrimaryKey(temp.getUserId()).getHeadPortrait());
                    item.setTag(temp.getTag());
                    item.setViewCount(temp.getViewCount());
                    item.setBorrow(true);
                    item.setPrice(temp.getPrice());
                    result.add(item);
                }
            }
        }
        return result;
    }
}
