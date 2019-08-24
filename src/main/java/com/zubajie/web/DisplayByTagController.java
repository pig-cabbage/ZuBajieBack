package com.zubajie.web;


import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.DisplayByTag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DisplayByTagController {
    @Autowired
    private DisplayByTag displayByTag;

    @PostMapping(value = "/displayLendByTag")
    public List<Item> displayLendByTag(String tag){
       return displayByTag.disLendByTag(tag);
    }

    @PostMapping(value ="/displayBorrowByTag")
    public List<Item> displayBorrowByTag(String tag){
        return displayByTag.disBorrowByTag(tag);
    }
}
