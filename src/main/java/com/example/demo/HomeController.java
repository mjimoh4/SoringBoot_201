package com.example.demo;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
    //private String login;

    @RequestMapping("/loadform")
    public String loadFormPage() {
        return "formtemplate";

    }

    //@RequestMapping("/processform")
    /*public String loadFormPage(@RequestParam("login") String login, Model model)
    {
        model.addAttribute("loginval", login);
        //String confirm = "confirm";
        return "confirm";
    } */

    @RequestMapping("/processform")
    public String loadFromPage(@RequestParam("login") String login, Model model) {
        //this.login = login;
        model.addAttribute("loginval", login);

        //String confirm = "confirm";
        return "confirm";
    }
}
