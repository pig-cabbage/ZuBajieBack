package com.zubajie.service;

import com.zubajie.entity.AccountPassword;

public interface LoginInService {
    boolean matchAccountAndPassword(String phoneNumber,String password);
}
