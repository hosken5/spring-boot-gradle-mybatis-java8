package com.hong.controller;

import com.hong.domain.Greeting;
import com.hong.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by hongpf on 16/5/13.
 */
@Controller
public class Index {

    @Autowired
    UserMapper userMapper ;

    @RequestMapping("/")
    @ResponseBody
    public Object  index (){
        Greeting g =  new Greeting(4l,"content");
        return  g;
    }

    @RequestMapping("/getUser")
    @ResponseBody
    public Object getUser(){
            return  userMapper.getUser("1");
    }
}
