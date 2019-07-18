package com.zubajie.service.impl;

import com.zubajie.dao.LendGoodsMapper;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.CreateLendItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateLendItemServiceimpl implements CreateLendItemService {
    @Autowired
    private LendGoodsMapper lendGoodsMapper;

    //上传借出物品的信息
    @Override
    public boolean createLendItem(LendGoods lendGoods){
        if(lendGoodsMapper.insert(lendGoods)==1){
            return true;
        }else
            return false;
    }
}
