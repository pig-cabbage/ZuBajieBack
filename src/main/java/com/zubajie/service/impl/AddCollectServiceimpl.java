package com.zubajie.service.impl;

import com.zubajie.dao.CollectMapper;
import com.zubajie.entity.Collect;
import com.zubajie.service.AddCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AddCollectServiceimpl implements AddCollectService {
    @Autowired
    private CollectMapper collectMapper;

    //添加收藏
    @Override
    public boolean addCollect(Collect collect){
        if(collectMapper.insert(collect)==1)
            return true;
        else
            return false;
    }
}
