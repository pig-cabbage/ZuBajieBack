package com.zubajie.web;

import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.DisplayCollectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisCollectcontroller {
    @Autowired
    private DisplayCollectService displayCollectService;

    @PostMapping(value = "/displayCollect")
    public List<Item>displayCollect(String userId){
        Integer realId=Integer.parseInt(userId);
        return  displayCollectService.disCollect(realId);
    }
}
