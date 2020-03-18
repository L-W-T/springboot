package com.lwt.springboot.websocket;

import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
/**
 * @program: springboot
 * @description: 发送类
 * @author: liangwt
 * @create: 2020-03-04 14:31
 **/
@RestController
@RequestMapping(value="/websocket")
public class WebSendController {

    @RequestMapping(value="/sendToOne", produces = {"application/json; charset=utf-8"},method={RequestMethod.POST,RequestMethod.GET})
    public void sendToOne(HttpServletRequest request,String message){
        String str = message;
        try {
            WebSocketServer.sendInfo(str);
        } catch (IOException e) {
// TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
