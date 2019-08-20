package com.zubajie.web;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.SearchGoodByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/search")
public class SearchGoodByNameController {
    @Autowired
    private SearchGoodByNameService searchGoodByNameService;

    //根据输入的关键词匹配相似度最高的借入物品
    @RequestMapping(value = "/searchLendGoodByName",method = RequestMethod.GET)
    public Map<String,Object> searchLendGoodByName(@RequestParam("goodName") String goodName){
        Map<String,Object>returnMap=new HashMap<String,Object>();
        List<LendGoods> groupList=searchGoodByNameService.getLendGoodListByGroupName(goodName);
        returnMap.put("LendGoodList",groupList);
        return returnMap;
    }

    //根据输入的关键词匹配相似度最高的借出物品
    @RequestMapping(value = "/searchBorrowGoodByName",method = RequestMethod.GET)
    public Map<String,Object> searchBorrowGoodByName(@RequestParam("goodName") String goodName){
        Map<String,Object>returnMap=new HashMap<String,Object>();
        List<BorrowGoods> groupList=searchGoodByNameService.getBorrowGoodListByGroupName(goodName);
        returnMap.put("BorrowGoodList",groupList);
        return returnMap;
    }

    //根据输入的关键词匹配相似度最高的所有物品
    @RequestMapping(value = "/searchAllGoodByName",method = RequestMethod.GET)
    public Map<String,Object> searchAllGoodByName(@RequestParam("goodName") String goodName){
        Map<String,Object>returnMap=new HashMap<String,Object>();
        List<BorrowGoods> borrowGoodsList=searchGoodByNameService.getBorrowGoodListByGroupName(goodName);
        returnMap.put("BorrowGoodList",borrowGoodsList);
        List<LendGoods> lendGoodsList=searchGoodByNameService.getLendGoodListByGroupName(goodName);
        returnMap.put("LendGoodList",lendGoodsList);
        return returnMap;
    }
}
