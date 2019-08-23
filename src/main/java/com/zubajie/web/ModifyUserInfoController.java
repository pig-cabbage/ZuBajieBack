package com.zubajie.web;

import com.zubajie.entity.User;
import com.zubajie.service.UserInfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ModifyUserInfoController {

    @Autowired
    private UserInfomationService userInfomationService;

    @RequestMapping("/modifyUserInformation")
    public Map<String,Object> modifyUserInformation(@RequestBody User user){
        Map<String,Object> res=new HashMap<>();
        if(userInfomationService.modifyUserInformation(user)){
            res.put("success",1);
            return res;
        }
        res.put("success",0);
        return res;
    }
}
