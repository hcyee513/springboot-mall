package com.irenehuang.springboot_mall.service;

import com.irenehuang.springboot_mall.dto.UserRegisterRequest;
import com.irenehuang.springboot_mall.model.User;

public interface UserService {
    
    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

}
