package com.lwt.springboot.autoGenerator.service.impl;

import com.lwt.springboot.autoGenerator.bean.OuternetUser;
import com.lwt.springboot.autoGenerator.mapper.OuternetUserMapper;
import com.lwt.springboot.autoGenerator.service.IOuternetUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 外网用户表 服务实现类
 * </p>
 *
 * @author liangwt
 * @since 2020-05-26
 */
@Service
public class OuternetUserServiceImpl extends ServiceImpl<OuternetUserMapper, OuternetUser> implements IOuternetUserService {

}
