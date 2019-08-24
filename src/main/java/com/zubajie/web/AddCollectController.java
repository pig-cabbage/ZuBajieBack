package com.zubajie.web;

import com.zubajie.entity.Collect;
import com.zubajie.service.AddCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AddCollectController {
    @Autowired
    private AddCollectService addCollectService;

    @PostMapping(value = "/addcollect")
    public boolean addCollect( String userId, String goodId){
        Map<String,Object>res=new HashMap<String, Object>();
        if(addCollectService.addCollect( userId,goodId))
            return true;
        else
            return false;

    }
}
