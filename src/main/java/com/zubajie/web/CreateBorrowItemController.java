package com.zubajie.web;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.service.CreateBorrowItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
public class CreateBorrowItemController {
    @Autowired
    private CreateBorrowItemService createBorrowItemService;



    @PostMapping(value = "/addborrowitem")
    public boolean createBorrowItem(String title,String description,String price,String tag,String validity,String keyList){

        BorrowGoods newItem=new BorrowGoods();
        newItem.setViewCount(0);

        if(createBorrowItemService.createBorrowItem(borrowGoods)){
            res.put("success",1);
        }else
            res.put("success",0);
        return res;
    }
}
