package com.lwt.springboot.service.impl;

import com.lwt.springboot.domain.UserBean;
import com.lwt.springboot.mapper.UserMapper;
import com.lwt.springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;
    @Override
    public List<UserBean> queryUserInfo() {
        return userMapper.queryUserInfo();
    }
}
