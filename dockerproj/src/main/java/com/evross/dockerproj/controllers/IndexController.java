package com.evross.dockerproj.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.Model;

@Controller
public class IndexController {
    @GetMapping("/foo")
    public String theIndex(Model model){
        String name = "Eric2";
        model.addAttribute("user", name);
        return "foo";
    }
}
