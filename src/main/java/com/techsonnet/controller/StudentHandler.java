package com.techsonnet.controller;

import com.alibaba.fastjson.JSON;
import com.techsonnet.pojo.Student;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/student")
public class StudentHandler {

    @RequestMapping("/login")
    @ResponseBody
    public String login(@Validated @RequestBody Student student, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            return JSON.toJSONString(bindingResult.getAllErrors());
        }
        return "ok";
    }
}
