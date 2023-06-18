package com.example.usermanager;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(Model model) {
        model.addAttribute("pageTitle", "Spring Boot Example");
        model.addAttribute("welcomeMessage", "Hello World!");
        return "index";
    }
}
