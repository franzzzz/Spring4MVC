package com.practice;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by SXY on 2016/1/18.
 */
// 声明为controller控制器，捕获请求并处理请求
@Controller
public class HelloController {

//    捕获 /hello 请求，利用hello(Model model) 处理请求，并返回‘hello’，交给Thymeleaf 处理
//    hello 对应html文件名。model 作为信息的载体，封装各类变量、对象
    @RequestMapping("/hello")
    public String hello(Model model) {
        String name = "Spring4 MVC";

        model.addAttribute("name", name);

        return "hello";
    }
}
