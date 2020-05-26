package com.lwt.springboot.controller;

import com.lwt.springboot.domain.UserBean;
import com.lwt.springboot.mapper.UsersMapper;
import com.lwt.springboot.service.IRedisService;
import com.lwt.springboot.service.IUserService;
import com.lwt.springboot.utils.RedisUtil;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;
    @Autowired
    private IRedisService redisService;
    
    @Autowired
    private UsersMapper userMapper;

    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value="/queryUserInfo", method= RequestMethod.GET)
    public String queryUserInfo(Model m){
        List<UserBean> userBeans = userService.queryUserInfo();
        m.addAttribute("userBeans",userBeans);
        redisService.lSet("userBeans",userBeans);
        return "listUserInfo";
    }

    @ApiOperation(value="获取Redis中的用户列表", notes="获取Redis中的用户列表")
    @RequestMapping(value="/queryUserInfoInRedis", method= RequestMethod.GET)
    public String queryUserInfoInRedis(Model m){
        List<Object> objects = redisService.lGet("userBeans", 0, redisService.lGetListSize("userBeans"));
        m.addAttribute("userBeans",(List<UserBean>)objects.get(0));
        return "listUserInfo";
    }
    
    @ApiOperation(value="获取用户列表", notes="获取用户列表")
    @RequestMapping(value="/{id}/queryUsersInfo", method= RequestMethod.GET)
    @ResponseBody
    public List<UserBean> queryUsersInfo(@PathVariable("id") String id,Model m){
        List<UserBean> userBeans = userMapper.selectList(null);
        return userBeans;
    }

}
