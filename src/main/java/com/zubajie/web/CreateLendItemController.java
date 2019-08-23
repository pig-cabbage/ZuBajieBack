package com.zubajie.web;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.CreateLendItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
public class CreateLendItemController {
    @Autowired
    private CreateLendItemService createLendItemService;

    @RequestMapping(value = "/addlenditem",method = RequestMethod.POST)
    public Map<String,Object> createLendItem(String title,String description,String price,String tag,String validity,String keyList,String userId){
        Date newDate=new Date();
        LendGoods newItem=new LendGoods();
        newItem.setViewCount(0);
        newItem.setCreateTime(newDate);
        newItem.setDescription(description);
        newItem.setState(true);
        newItem.setUserId(Integer.parseInt(userId));
        //-1表示期限为无限
        if(validity.equals("无限"))
            newItem.setPeriodOfValidity(-1);
        else
            newItem.setPeriodOfValidity(Integer.parseInt(validity));
        List<String> imageList= Arrays.asList(keyList.split(" "));
        newItem.setPhotoNumber(imageList.size());
        newItem.setPrice(price);
        newItem.setTitle(title);
        newItem.setTitle(tag);
        HashMap<String,Object>res=new HashMap<>();
        if(createLendItemService.createLendItem(newItem,imageList)){

            res.put("success",1);
        }else
            res.put("success",0);
        return res;
    }
}
