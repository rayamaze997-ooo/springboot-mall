package com.jlaker.springbootmall.dao;

import com.jlaker.springbootmall.dto.UserRegisterRequest;
import com.jlaker.springbootmall.model.User;

public interface UserDao {


    User getUserById(Integer userId);

    User getUserByEmail(String email);

    Integer createUser(UserRegisterRequest userRegisterRequest);
}
