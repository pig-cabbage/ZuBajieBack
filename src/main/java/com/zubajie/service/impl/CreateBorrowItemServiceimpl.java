package com.zubajie.service.impl;

import com.zubajie.dao.BorrowGoodsMapper;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.service.CreateBorrowItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateBorrowItemServiceimpl implements CreateBorrowItemService {
    @Autowired
    private BorrowGoodsMapper borrowGoodsMapper;

    //发布借入物品的信息
    @Override
    public Boolean createBorrowItem(BorrowGoods borrowGoods){
        if(borrowGoodsMapper.insert(borrowGoods)==1){
            return  true;
        }
        else
            return false;
    }
}
