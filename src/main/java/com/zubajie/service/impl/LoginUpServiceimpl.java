package com.zubajie.service.impl;

import com.zubajie.dao.UserMapper;
import com.zubajie.entity.User;
import com.zubajie.service.LoginUpService;
import com.zubajie.service.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserDefinedFileAttributeView;
import java.util.List;

@Service
public class LoginUpServiceimpl implements LoginUpService {
    @Autowired
    private UserMapper userMapper;

    //注册
    @Override
    public boolean loginUp(User user){
        List<User>allUser=userMapper.selectAll();
        for(int i=0;i<allUser.size();++i){
            if(user.getPhoneNumber().equals(allUser.get(i).getPhoneNumber()))
                return false;
        }
        user.setPassword(MD5Utils.md5(user.getPassword()));
        if(userMapper.insert(user)==1)
            return true;
        else
            return false;
    }
}
