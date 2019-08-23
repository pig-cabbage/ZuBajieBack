package com.zubajie.service;

import com.zubajie.entity.LendGoods;

import java.util.List;

public interface CreateLendItemService {
    boolean createLendItem(LendGoods lendGoods, List<String> imageList);
}
