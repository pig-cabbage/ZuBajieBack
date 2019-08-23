package com.zubajie.web;

import com.zubajie.service.LoginInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/login")
public class LoginInController {

    @Autowired
    private LoginInService loginInService;


    @RequestMapping(value = "/login",method = RequestMethod.GET)
    public Map<String,Object> login(@RequestParam("phoneNumber") String phoneNumber,@RequestParam("password") String password){
        Map<String,Object>res=new HashMap<String, Object>();
        Integer userId=loginInService.matchAccountAndPassword(phoneNumber,password);
        if(userId!=0) {
            res.put("success", 1);
            res.put("userId",userId);
        }
        else
            res.put("success",0);
        return res;

    }
}
