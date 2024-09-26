package com.irenehuang.springboot_mall.service;

import com.irenehuang.springboot_mall.dto.UserLoginRequest;
import com.irenehuang.springboot_mall.dto.UserRegisterRequest;
import com.irenehuang.springboot_mall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    User login(UserLoginRequest userLoginRequest);

    Integer register(UserRegisterRequest userRegisterRequest);

}
