package com.boot.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


@Controller
public class TestController {

    @RequestMapping("/home/main")
    @ResponseBody
    public String showMain() {
        return "메인화면 입니다.";
    }

    @RequestMapping("/test")
    public String test() {
        return "list";
    }
}
