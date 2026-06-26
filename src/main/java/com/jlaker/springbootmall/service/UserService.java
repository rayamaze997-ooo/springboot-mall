package com.jlaker.springbootmall.service;

import com.jlaker.springbootmall.dto.UserLoginRequest;
import com.jlaker.springbootmall.dto.UserRegisterRequest;
import com.jlaker.springbootmall.model.User;

public interface UserService {

    User getUserById(Integer userId);

    Integer register(UserRegisterRequest userRegisterRequest);

    User login(UserLoginRequest userLoginRequest);
}
