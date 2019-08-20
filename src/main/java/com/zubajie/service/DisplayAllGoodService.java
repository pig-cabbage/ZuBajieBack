package com.zubajie.service;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;

import java.util.List;

public interface DisplayAllGoodService {
    List<LendGoods> displayAllLendGood();
    List<BorrowGoods> displayAllBorrowGood();
}
