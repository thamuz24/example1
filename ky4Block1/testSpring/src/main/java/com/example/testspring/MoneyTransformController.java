package com.example.testspring;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MoneyTransformController {
    @GetMapping("/show")
    public String showFormMoneyTransform(){
        return "FormTransformMoney";
    }
    @GetMapping("/transMoney")
    public String transMoney(@RequestParam("word") String word, Model model){
        Lib lib = new Lib();
        if (lib.search(word) != null) {
            model.addAttribute("result", lib.search(word));
        } else {
            model.addAttribute("result","yor word not found");
        }

        return "FormTransformMoney";
    }
}
