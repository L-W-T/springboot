package com.lwt.springboot.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.lwt.springboot.domain.UserBean;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import java.util.List;


public interface UsersMapper extends BaseMapper<UserBean>{

}
