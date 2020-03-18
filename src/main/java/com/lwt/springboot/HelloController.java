package com.lwt.springboot;

import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.StringHttpMessageConverter;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.nio.charset.StandardCharsets;

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

    public static void main(String[] args){
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.getMessageConverters().set(1, new StringHttpMessageConverter(StandardCharsets.UTF_8));
        ResponseEntity<String> response = restTemplate.getForEntity("http://tyrztest.gdbs.gov.cn/am/oauth2/tokeninfo?access_token=" + "133eb0d9-8170-47dc-a12c-b54071c068b3@node1", String.class);
        System.out.println("统一认证平台返回：" + response.getBody());
    }
}
