package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class MController {
    @GetMapping("/")
    public String redirectToEmployeeList() {
        return "redirect:/employees";
    }
}
