package com.example.week2maven;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
// 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 git token
@Controller
public class HomeController {
    private static final String EMAIL_REGEX = "^[a-zA-z0-9]+[a-zA-Z0-9]*@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)$";
    private static Pattern pattern;

    public HomeController() {
        pattern = Pattern.compile(EMAIL_REGEX);
    }

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @PostMapping("/validate")
    public String user(@RequestParam("email") String email, Model model) {
        boolean isValid = this.validate(email);
        if (!isValid) {
            model.addAttribute("message","Email is invalid");
            return "home";
        }
        model.addAttribute("email", email);
        return "success";
    }

    private boolean validate(String regex) {
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
