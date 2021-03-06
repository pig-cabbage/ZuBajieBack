package com.zubajie.service.impl;

import com.zubajie.dao.CollectMapper;
import com.zubajie.entity.Collect;
import com.zubajie.service.AddCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddCollectServiceimpl implements AddCollectService {


    @Autowired
    private CollectMapper mapper;

    //添加收藏
    @Override
    public boolean addCollect(String userId,String goodId){
        Collect temp=new Collect();
        temp.setUserId(Integer.parseInt(userId));
        temp.setGoodsId(Integer.parseInt(goodId));
        if(mapper.insert(temp)==1)
            return true;
        else
            return false;
    }
}
