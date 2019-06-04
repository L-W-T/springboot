package com.lwt.springboot.mapper;

import com.lwt.springboot.domain.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {
    /*@Results(id = "userBeans",value = {
            @Result(property = "uId",column = "u_id"),
            @Result(property = "uName",column = "u_name")
    })
    @Select("select * from outernet_user")*/
    List<UserBean> queryUserInfo();
}
