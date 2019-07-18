package com.zubajie.web;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.service.CreateBorrowItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/addborrowitem")
public class CreateBorrowItemController {
    @Autowired
    private CreateBorrowItemService createBorrowItemService;



    @RequestMapping(value = "/addborrowitem",method = RequestMethod.POST)
    public Map<String,Object> createBorrowItem(@RequestBody BorrowGoods borrowGoods){
        Map<String,Object> res=new HashMap<>();
        Date nowDate=new Date();
        borrowGoods.setCreateTime(nowDate);
        byte temp=0;
        borrowGoods.setState(temp);
        borrowGoods.setViewCount(0);
        if(createBorrowItemService.createBorrowItem(borrowGoods)){
            res.put("success",1);
        }else
            res.put("success",0);
        return res;
    }
}
