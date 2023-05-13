package com.techsonnet.controller;

import com.alibaba.fastjson.JSON;
import com.techsonnet.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserHandler {

    @RequestMapping("/getUser")
    @ResponseBody
    public String getUser(@RequestBody User user){
        user.setId(2);
        user.setName("lisi");
        System.out.println(user);
        System.out.println(user);
        return JSON.toJSONString(user);
    }

    @RequestMapping("/converter")
    @ResponseBody
    public String converter(User user){
        System.out.println(user);
        System.out.println(user.toString());
        return JSON.toJSONString(user);
    }

}
