package com.zubajie.service.impl;

import com.zubajie.dao.BorrowGoodsMapper;
import com.zubajie.dao.LendGoodsMapper;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.DisplayAllGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DisplayAllGoodServiceImpl implements DisplayAllGoodService {

    @Autowired
    private LendGoodsMapper lendGoodsMapper;
    @Autowired
    private BorrowGoodsMapper borrowGoodsMapper;


    @Override
    public List<LendGoods> displayAllLendGood() {
        List<LendGoods> lendGoodsList=lendGoodsMapper.selectAll();
        return lendGoodsList;
    }

    @Override
    public List<BorrowGoods> displayAllBorrowGood() {
        List<BorrowGoods> borrowGoodsList=borrowGoodsMapper.selectAll();
        return borrowGoodsList;
    }
}
