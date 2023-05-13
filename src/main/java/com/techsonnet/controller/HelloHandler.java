package com.techsonnet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloHandler {


    @RequestMapping("/index")
    public String index(){
        System.out.println("收到请求");
        // 返回逻辑视图，配合视图解析器，会映射成 '/index.jsp'
        return "index";
    }

}


