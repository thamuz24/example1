package com.example.demo.control;

import com.example.demo.model.Lib;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class libController {
    @PostMapping("/translate")
    public String translate(@RequestParam("world") String world, Model model) {
        Lib lib = new Lib();
        if (lib.search(world) != null) {
            model.addAttribute("result", lib.search(world));
        } else {
            model.addAttribute("error", "Could not find woe world");
        }
        return "library";
    }

    @GetMapping("/library")
    public String library() {
        return "library";
    }
}
