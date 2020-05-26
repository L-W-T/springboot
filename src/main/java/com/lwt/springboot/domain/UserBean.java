package com.lwt.springboot.domain;


import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.TableName;
@TableName("outernet_user")
public class UserBean implements Serializable {
    private String uId;
    private String uName;
    private String name;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
