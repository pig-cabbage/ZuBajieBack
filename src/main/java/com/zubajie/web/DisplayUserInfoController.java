package com.zubajie.web;

import com.zubajie.entity.User;
import com.zubajie.service.UserInfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class DisplayUserInfoController {
    @Autowired
    private UserInfomationService userInfomationService;

    @RequestMapping("/getUserInfo")
    public Map<String,Object> getUserInfoById(@RequestParam("userId") Integer userId){
        Map<String,Object> res=new HashMap<>();
        User user=userInfomationService.getUserInformation(userId);
        res.put("userInfo",user);
        return res;
    }
}
