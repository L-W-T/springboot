package com.lwt.springboot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {
    private Logger logger = LoggerFactory.getLogger(getClass());

    @ExceptionHandler
    public ResponseResult processMsg(Exception e) {
        logger.error(e.getMessage(), e);
        //return ResponseResult.failed("系统出错!");
        return ResponseResult.failed(e.getLocalizedMessage());
    }
    /*@ExceptionHandler
    @ResponseBody
    public Map processMsg(Exception e) {
        logger.error(e.getMessage(), e);
        Map map = new HashMap<String,Object>();
        map.put("code","1");
        map.put("desc","系统出错!");
        map.put("data","");
        return map;
    }*/
}
