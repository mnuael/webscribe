package com.github.mnuael.webscribe;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BlogController {

    @Value("${blog.name}")
    private String blogName;

    @GetMapping("/week")
    public String getWeekList(Model model) {
        return "week/week-list";
    }

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("blogName", blogName);
        return "home/home";
    }
}
