package com.techsonnet.controller;

import com.alibaba.fastjson.JSON;
import com.techsonnet.pojo.Account;
import com.techsonnet.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/account")
public class AccountHandler {

    @RequestMapping("/login")
    @ResponseBody
    public String login(@Validated @RequestBody  Account account, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            System.out.println("test");
            return JSON.toJSONString(bindingResult.getAllErrors());
        }
        System.out.println("test");
        return "everything is ok !";
    }

}
