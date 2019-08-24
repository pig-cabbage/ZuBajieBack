package com.zubajie.service.impl;

import com.zubajie.dao.BorrowGoodsMapper;
import com.zubajie.dao.BorrowPictureMapper;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.BorrowPicture;
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
            List<BorrowGoods>allList=borrowGoodsMapper.selectAll();
            for(int i=allList.size()-1;i>=0;--i){
                if(allList.get(i).getBorrowId()>0){
                    BorrowGoods temp=allList.get(i);
                    //将主键值变更为相反数，也就是负数，用于与lendId区分
                    updatePrimaryKey(temp.getBorrowId());
                    for(int k=0;k<list.size();++k){
                        BorrowPicture newItem=new BorrowPicture();
                        newItem.setBorrowId(0-temp.getBorrowId());
                        newItem.setPhotoUrl(list.get(k));
                        borrowPictureMapper.insert(newItem);
                    }
                    break;
                }
            }
            return  true;
        }
        else
            return false;
    }

    @Override
    public Boolean updatePrimaryKey(Integer borrowId){
        if(borrowGoodsMapper.updatePrimaryKeyToOpposite(borrowId)==1)
            return true;
        return false;
    }

}
