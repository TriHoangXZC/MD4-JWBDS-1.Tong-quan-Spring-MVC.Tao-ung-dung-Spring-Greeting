package com.codegym.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
//@Controller: Đánh dấu class GreetingController là 1 controller
public class GreetingController {
    @GetMapping("/greeting")
//    @GetMapping: đánh dấu greeting() là phương thức dùng để
//    xử lý request GET được gửi đến đường dẫn "/greeting"
    public String greeting() {
        return "index";
//        "index": trang view hiển thị
    }

//    Nhận tham số từ URL
    @GetMapping("/hello")
    public String hello(@RequestParam(name = "name", required = false) String name, Model model) {
        model.addAttribute("name", name);
        return "hello";
    }
}
