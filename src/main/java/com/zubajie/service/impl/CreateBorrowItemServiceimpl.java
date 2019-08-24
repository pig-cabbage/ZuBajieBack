package com.zubajie.service.impl;

import com.zubajie.dao.BorrowGoodsMapper;
import com.zubajie.dao.BorrowPictureMapper;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.BorrowPicture;
import com.zubajie.entity.LendPicture;
import com.zubajie.service.CreateBorrowItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateBorrowItemServiceimpl implements CreateBorrowItemService {
    @Autowired
    private BorrowGoodsMapper borrowGoodsMapper;
    @Autowired
    private BorrowPictureMapper borrowPictureMapper;

    //发布借入物品的信息
    @Override
    public Boolean createBorrowItem(BorrowGoods borrowGoods,List<String> list){
        //插入数据库成功
        if(borrowGoodsMapper.insert(borrowGoods)==1){
            for(int k=0;k<list.size();++k){
                BorrowPicture newItem=new BorrowPicture();
                newItem.setBorrowId(borrowGoodsMapper.selectAll().size()-1+1000000);
                newItem.setPhotoUrl(list.get(k));
                borrowPictureMapper.insert(newItem);
            }
            return  true;
        }
        else
            return false;
    }



}
