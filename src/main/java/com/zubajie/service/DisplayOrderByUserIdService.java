package com.zubajie.service;

import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.entity.Order;
import com.zubajie.service.AndroidEntity.AndroidOrder;

import java.util.List;

public interface DisplayOrderByUserIdService {
    List<AndroidOrder> displayOrderByUserId(Integer userId);


}
