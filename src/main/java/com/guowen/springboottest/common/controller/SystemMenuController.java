package com.guowen.springboottest.common.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SystemMenuController {

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "/index";
    }
}
