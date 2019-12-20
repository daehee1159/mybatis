package com.boot.board.controller;

import com.boot.board.dto.Article;
import com.boot.board.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


@Controller
public class ArticleController {

    //처음 테스트
    @RequestMapping("/article/list")
//    @ResponseBody
    public String showList() {
        return "list";
    }

    //thymeleaf 테스트
    @RequestMapping(value = "/123", method = RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute("msg", "HiHi");
        return "list";
    }

    @Autowired
    ArticleService articleService;

    @RequestMapping("/article/list1")
    public String showList1(Model model) {
        List<Article> list = articleService.getList();

        System.out.println("list : " + list);

        model.addAttribute("list", list);
        return "list";
    }
}
