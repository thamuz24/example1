package com.example.week2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller()
public class Caculator {
    @GetMapping("/caculator")
    public String getCaculator()
}
