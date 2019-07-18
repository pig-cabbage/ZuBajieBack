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
    public Map<String,Object> login(@RequestParam String phoneNumber,@RequestParam String password){
        Map<String,Object>res=new HashMap<String, Object>();
        if(loginInService.matchAccountAndPassword(phoneNumber,password))
            res.put("success",1);
        else
            res.put("success",0);
        return res;

    }
}
