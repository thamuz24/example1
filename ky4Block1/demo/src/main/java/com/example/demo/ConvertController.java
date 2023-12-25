package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConvertController {
    @PostMapping("/convert")
    public String convert(@RequestParam("money") int money, @RequestParam("ratio") int ratio, Model model) {
        int result = money*ratio;
        model.addAttribute("money",money);
        model.addAttribute("ratio",ratio);
        model.addAttribute("result", result);
        return "convert";
    }

    @GetMapping("")
    public String home(Model model) {
        return "convert";
    }

    @GetMapping("/greeting")
    public String greeting(Model model) {
        return "index";
    }
}
