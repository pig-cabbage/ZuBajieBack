package com.zubajie.service;

import com.zubajie.entity.User;

public interface UserInfomationService {
    User getUserInformation(Integer userId);

    Boolean modifyUserInformation(User user);
}
