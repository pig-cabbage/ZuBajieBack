package com.zubajie.web;


import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.DisplayAllGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class DisplayAllGoodController {
    @Autowired
    private DisplayAllGoodService displayAllGoodService;

    @RequestMapping("displayAllGoods")
    public Map<String,Object> displayAllGoods(){
        Map<String,Object> res=new HashMap<>();
        List<LendGoods> lendGoodsList=displayAllGoodService.displayAllLendGood();
        List<BorrowGoods> borrowGoodsList=displayAllGoodService.displayAllBorrowGood();
        res.put("lendGoods",lendGoodsList);
        res.put("borrowgoods",borrowGoodsList);
        return res;
    }

    @RequestMapping("displayLendGoods")
    public Map<String,Object> displayLendGoods(){
        Map<String,Object> res=new HashMap<>();
        List<LendGoods> lendGoodsList=displayAllGoodService.displayAllLendGood();
        res.put("lendGoods",lendGoodsList);
        return res;
    }

    @RequestMapping("displayBorrowGoods")
    public Map<String,Object> displayBorrowGoods(){
        Map<String,Object> res=new HashMap<>();
        List<BorrowGoods> BorrowGoodsList=displayAllGoodService.displayAllBorrowGood();
        res.put("lendGoods",BorrowGoodsList);
        return res;
    }
}
