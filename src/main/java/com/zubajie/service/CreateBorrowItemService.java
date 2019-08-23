package com.zubajie.service;

import com.zubajie.entity.BorrowGoods;

import java.util.List;

public interface CreateBorrowItemService {
    Boolean createBorrowItem(BorrowGoods borrowItem, List<String> list);

    Boolean updatePrimaryKey(Integer BorrowId);

}
