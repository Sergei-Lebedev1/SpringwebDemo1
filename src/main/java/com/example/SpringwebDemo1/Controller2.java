package com.example.SpringwebDemo1;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Controller2 {
    @GetMapping("/helloUser")
    public String hello(String username, Model modelka){
        System.out.println("метод hello = " +username);
        modelka.addAttribute("x",username);
        System.out.println("modelka " + username);
        return "helloUser";
    }
}
