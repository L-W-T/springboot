package com.lwt.springboot.service;

import com.lwt.springboot.domain.UserBean;

import java.util.List;

public interface IUserService {
    List<UserBean> queryUserInfo();
}
