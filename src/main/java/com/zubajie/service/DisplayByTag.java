package com.zubajie.service;

import com.zubajie.service.AndroidEntity.Item;

import java.util.List;

public interface DisplayByTag {

    List<Item> disBorrowByTag(String tag);

    List<Item> disLendByTag(String tag);
}
