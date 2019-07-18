package com.zubajie.service.impl;

import com.zubajie.dao.UserMapper;
import com.zubajie.entity.User;
import com.zubajie.service.LoginInService;
import com.zubajie.service.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoginInServiceimpl implements LoginInService {
    @Autowired
    private UserMapper userMapper;

    //登录
    @Override
    public boolean matchAccountAndPassword(String phoneNumber,String password){
        List<User> allAccount=userMapper.selectAll();
        int temp=0;
        for(int i=0;i<allAccount.size();++i){
            if(phoneNumber.equals(allAccount.get(i).getPhoneNumber())) {
                temp=i;
                break;
            }
            if(i==allAccount.size()-1)
                return  false;
        }
        if(MD5Utils.md5(password).equals(allAccount.get(temp).getPassword()))
            return true;
        else
            return false;
    }
}
