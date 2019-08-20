package com.zubajie.service;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;

import java.util.List;

public interface SearchGoodByNameService {
    List<LendGoods> getLendGoodListByGroupName(String goodName);

    List<BorrowGoods> getBorrowGoodListByGroupName(String goodName);

    float getSimilarityRatio(String str,String target);

    int compare(String str,String target);

    int min(int one, int two, int three);
}
