package com.zubajie.service;

import com.zubajie.entity.Order;

import java.util.List;

public interface DisplayOrderByUserIdService {
    List<Order> displayOrderByUserId(Integer userId);
}
