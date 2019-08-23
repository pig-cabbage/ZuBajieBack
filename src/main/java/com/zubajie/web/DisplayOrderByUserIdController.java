package com.zubajie.web;

import com.zubajie.service.AndroidEntity.AndroidOrder;
import com.zubajie.service.DisplayOrderByUserIdService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisplayOrderByUserIdController {
    @Autowired
    private DisplayOrderByUserIdService displayOrderByUserIdService;

    @PostMapping(value = "/displayorderbyuserid" )
    public List<AndroidOrder> displayOrderByUserId(@RequestBody  String userId){
        int temp=Integer.parseInt(userId);
        return displayOrderByUserIdService.displayOrderByUserId(temp);

    }
}
