package com.houjun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping("/insert")
    public String add() {
        return "insert";
    }

    @RequestMapping("/del")
    public String del() {
        return "del";
    }

    @RequestMapping("/look")
    public String look() {
        return "look";
    }

    @RequestMapping("/update")
    public String update() {
        return "update";
    }
    @RequestMapping("/list")
    public String list() {
        return "list";
    }
}
