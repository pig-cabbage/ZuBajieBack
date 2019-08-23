package com.zubajie.service.impl;

import com.zubajie.dao.UserMapper;
import com.zubajie.entity.User;
import com.zubajie.service.UserInfomationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserInfomationServiceImpl implements UserInfomationService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getUserInformation(Integer userId) {
        User user=userMapper.selectByPrimaryKey(userId);
        return user;
    }

    @Override
    public Boolean modifyUserInformation(User user) {
        User oldUser=userMapper.selectByPrimaryKey(user.getUserId());
        oldUser.setStudentNumber(user.getStudentNumber());
        oldUser.setAddress(user.getAddress());
        oldUser.setAuditPicture(user.getAuditPicture());
        oldUser.setNickName(user.getNickName());
        oldUser.setSex(user.getSex());
        oldUser.setUserName(user.getUserName());
        if(userMapper.updateByPrimaryKey(oldUser)==1)return true;
        return false;
    }


}
