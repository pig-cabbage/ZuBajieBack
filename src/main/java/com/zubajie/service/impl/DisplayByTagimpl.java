package com.zubajie.service.impl;

import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.DisplayAllGoodService;
import com.zubajie.service.DisplayByTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DisplayByTagimpl implements DisplayByTag {

    @Autowired
    private DisplayAllGoodService displayAllGoodService;

    @Override
    public List<Item> disLendByTag(String tag){
        List<Item>result=new ArrayList<>();
        List<Item> allLendList=displayAllGoodService.displayLendGoods();
        for(int i=0;i<allLendList.size();++i){
            if(allLendList.get(i).getTag().equals(tag))
                result.add(allLendList.get(i));
        }
        return result;
    }

    @Override
    public List<Item> disBorrowByTag(String tag){
        List<Item>result=new ArrayList<>();
        List<Item> allBorrowList=displayAllGoodService.displayBorrowGoods();
        for(int i=0;i<allBorrowList.size();++i){
            if(allBorrowList.get(i).getTag().equals(tag))
                result.add(allBorrowList.get(i));
        }
        return result;

    }

}
