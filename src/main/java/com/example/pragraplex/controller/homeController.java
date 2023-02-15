package com.example.pragraplex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class homeController {

    @GetMapping("/")
    public String index(Model model ){
     model.addAttribute("className","spring Titans");
        return "index";
    }
}
