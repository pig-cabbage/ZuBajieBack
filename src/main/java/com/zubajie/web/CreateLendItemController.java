package com.zubajie.web;

import com.zubajie.entity.LendGoods;
import com.zubajie.service.CreateLendItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CreateLendItemController {
    @Autowired
    private CreateLendItemService createLendItemService;

    @RequestMapping(value = "/addlenditem",method = RequestMethod.POST)
    public Map<String,Object> createLendItem(@RequestBody LendGoods lendGoods){
        Map<String,Object>res=new HashMap<String,Object>();
        Date nowDate=new Date();
        lendGoods.setCreateTime(nowDate);
        byte temp=0;
        lendGoods.setState(true);
        lendGoods.setViewCount(0);
        if(createLendItemService.createLendItem(lendGoods))
            res.put("success",1);
        else
            res.put("success",0);
        return res;
    }
}
