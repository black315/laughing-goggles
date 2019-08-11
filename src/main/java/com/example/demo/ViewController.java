package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Viewコントローラ
 */
@Controller
@RequestMapping("/")
class ViewController {
    @GetMapping
    public String view() {
        return "view";
    }
}