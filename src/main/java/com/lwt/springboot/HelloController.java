package com.lwt.springboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
    @RequestMapping("/hello")
    public void hello(){
        //m.addAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        throw new NullPointerException();
        //return "hello";
    }

    @RequestMapping("/layui")
    public String layui(){
        return "layui";
    }
    @RequestMapping("/userList")
    public String userList(){
        return "layui";
    }
}
