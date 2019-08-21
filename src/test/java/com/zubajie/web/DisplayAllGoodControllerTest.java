package com.zubajie.web;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DisplayAllGoodControllerTest {
    @Autowired
    private DisplayAllGoodController displayAllGoodController;
    @Test
    public void displayAllGoods() {
    }
}