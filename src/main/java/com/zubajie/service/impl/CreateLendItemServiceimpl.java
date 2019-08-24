package com.zubajie.service.impl;

import com.zubajie.dao.LendGoodsMapper;
import com.zubajie.dao.LendPictureMapper;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.BorrowPicture;
import com.zubajie.entity.LendGoods;
import com.zubajie.entity.LendPicture;
import com.zubajie.service.CreateLendItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreateLendItemServiceimpl implements CreateLendItemService {
    @Autowired
    private LendGoodsMapper lendGoodsMapper;
    @Autowired
    private LendPictureMapper lendPictureMapper;

    //上传借出物品的信息
    @Override
    public boolean createLendItem(LendGoods lendGoods, List<String> list){
        //插入数据库成功
        if(lendGoodsMapper.insert(lendGoods)==1){
            for(int k=0;k<list.size();++k){
                LendPicture newItem=new LendPicture();
                newItem.setLendId(lendGoodsMapper.selectAll().size());
                newItem.setPhotoUrl(list.get(k));
                lendPictureMapper.insert(newItem);
            }
            return  true;
        }
        else
            return false;
    }
}
