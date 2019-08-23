package com.zubajie.service;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.AndroidEntity.Item;

import java.util.List;

public interface SearchGoodByNameService {
    List<Item> getLendGoodListByGroupName(String goodName);

    List<Item> getBorrowGoodListByGroupName(String goodName);

    float getSimilarityRatio(String str,String target);

    int compare(String str,String target);

    int min(int one, int two, int three);
}
