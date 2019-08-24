package com.zubajie.web;

import com.zubajie.entity.User;
import com.zubajie.service.LoginUpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/loginup")
public class LoginUpCOntroller {
    @Autowired
    private LoginUpService loginUpService;

    @RequestMapping(value = "/loginup",method = RequestMethod.POST)
    public Map<String,Object> loginUp(@RequestBody User user ){
        Map<String,Object>res=new HashMap<String, Object>();
        if(loginUpService.loginUp(user))
            res.put("success",1);
        else
            res.put("success",0);
        return res;
    }
}
