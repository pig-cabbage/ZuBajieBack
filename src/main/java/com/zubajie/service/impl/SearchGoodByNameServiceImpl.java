package com.zubajie.service.impl;

import com.zubajie.dao.*;
import com.zubajie.entity.BorrowGoodWithSimiliarity;
import com.zubajie.entity.BorrowGoods;
import com.zubajie.entity.LendGoodWithSimiliarity;
import com.zubajie.entity.LendGoods;
import com.zubajie.service.AndroidEntity.Item;
import com.zubajie.service.SearchGoodByNameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

@Service
public class SearchGoodByNameServiceImpl implements SearchGoodByNameService {
    @Autowired
    private LendGoodsMapper lendGoodsMapper;
    @Autowired
    private BorrowGoodsMapper borrowGoodsMapper;
    @Autowired
    private LendPictureMapper lendPictureMapper;
    @Autowired
    private BorrowPictureMapper borrowPictureMapper;

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<Item> getLendGoodListByGroupName(String goodName) {
        List<LendGoods>list=lendGoodsMapper.selectAll();
        List<LendGoodWithSimiliarity>list_1=new ArrayList<>();
        List<LendGoods>result_1=new ArrayList<>();
        List<Item>result=new ArrayList<>();
        Collections.sort(list_1, new Comparator<LendGoodWithSimiliarity>() {
            @Override
            public int compare(LendGoodWithSimiliarity o1, LendGoodWithSimiliarity o2) {
                return o2.getSimiliarity().compareTo(o1.getSimiliarity());
            }
        });
        for(int i=0;i<list_1.size();i++){
            if(list_1.get(i).getSimiliarity()>0){
                LendGoods temp=lendGoodsMapper.selectByPrimaryKey(list_1.get(i).getLendGoodId());

                Item item=new Item();
                item.setGoodId(temp.getLendId());
                item.setTitle(temp.getTitle());
                item.setDescription(temp.getDescription());
                item.setUserId(temp.getUserId());
                item.setCreateTime(temp.getCreateTime());
                item.setValidity(temp.getPeriodOfValidity());
                item.setImageList(lendPictureMapper.findByGoodId(temp.getLendId()));
                System.out.println(temp.getLendId()+"啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
                item.setUserImage(userMapper.selectByPrimaryKey(temp.getUserId()).getHeadPortrait());
                item.setTag(temp.getTag());
                item.setViewCount(temp.getViewCount());
                item.setBorrow(false);
                item.setPrice(temp.getPrice());
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public List<Item> getBorrowGoodListByGroupName(String goodName) {
        List<BorrowGoods>list=borrowGoodsMapper.selectAll();
        List<BorrowGoodWithSimiliarity>list_1=new ArrayList<>();
        List<Item>result=new ArrayList<>();
        Collections.sort(list_1, new Comparator<BorrowGoodWithSimiliarity>() {
            @Override
            public int compare(BorrowGoodWithSimiliarity o1, BorrowGoodWithSimiliarity o2) {
                return o2.getSimiliarity().compareTo(o1.getSimiliarity());
            }
        });
        for(int i=0;i<list_1.size();i++){
            if(list_1.get(i).getSimiliarity()>0){
                BorrowGoods temp=borrowGoodsMapper.selectByPrimaryKey(list_1.get(i).getBorrowGoodId());

                Item item=new Item();
                item.setGoodId(temp.getBorrowId());
                item.setTitle(temp.getTitle());
                item.setDescription(temp.getDescription());
                item.setUserId(temp.getUserId());
                item.setCreateTime(temp.getCreateTime());
                item.setValidity(temp.getPeriodOfValidity());
                item.setImageList(borrowPictureMapper.findByGoodId(temp.getBorrowId()));
                System.out.println(temp.getBorrowId()+"啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊啊");
                item.setUserImage(userMapper.selectByPrimaryKey(temp.getUserId()).getHeadPortrait());
                item.setTag(temp.getTag());
                item.setViewCount(temp.getViewCount());
                item.setBorrow(true);
                item.setPrice(temp.getPrice());
                result.add(item);
            }
        }
        return result;
    }

    @Override
    public float getSimilarityRatio(String str,String target){
        return 1 - (float) compare(str, target) / Math.max(str.length(), target.length());
    }
    @Override
    public int compare(String str,String target){
        int d[][]; // 矩阵
        int n = str.length();
        int m = target.length();
        int i; // 遍历str的
        int j; // 遍历target的
        char ch1; // str的
        char ch2; // target的
        int temp; // 记录相同字符,在某个矩阵位置值的增量,不是0就是1
        if (n == 0) {
            return m;
        }
        if (m == 0) {
            return n;
        }
        d = new int[n + 1][m + 1];
        for (i = 0; i <= n; i++) { // 初始化第一列
            d[i][0] = i;
        }

        for (j = 0; j <= m; j++) { // 初始化第一行
            d[0][j] = j;
        }

        for (i = 1; i <= n; i++) { // 遍历str
            ch1 = str.charAt(i - 1);
            // 去匹配target
            for (j = 1; j <= m; j++) {
                ch2 = target.charAt(j - 1);
                if (ch1 == ch2) {
                    temp = 0;
                } else {
                    temp = 1;
                }

                // 左边+1,上边+1, 左上角+temp取最小
                d[i][j] = min(d[i - 1][j] + 1, d[i][j - 1] + 1, d[i - 1][j - 1] + temp);
            }
        }
        return d[n][m];
    }

    @Override
    public int min(int one, int two, int three) {
        return (one = one < two ? one : two) < three ? one : three;
    }


}
