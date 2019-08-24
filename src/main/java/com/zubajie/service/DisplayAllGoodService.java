package com.zubajie.service;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.AndroidEntity.Item;

import java.util.List;

public interface DisplayAllGoodService {
    List<Item>displayLendGoods();

    List<Item>displayBorrowGoods();
}
