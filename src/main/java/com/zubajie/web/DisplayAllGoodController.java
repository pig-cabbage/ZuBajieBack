package com.zubajie.web;


import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.DisplayAllGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisplayAllGoodController {
    @Autowired
    private DisplayAllGoodService displayAllGoodService;



    @PostMapping("displayLendGoods")
    public List<Item> displayLendGoods(){

        List<Item> lendGoodsList=displayAllGoodService.displayLendGoods();
        return lendGoodsList;
    }

    @PostMapping("displayBorrowGoods")
    public List<Item> displayBorrowGoods(){

        List<Item> borrowGoodsList=displayAllGoodService.displayBorrowGoods();
        return borrowGoodsList;
    }
}
