package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @RequestMapping("/")
    public String disp(){
        return "Printing without security...";
    }

    @RequestMapping("/protecteduser")
    public String protectedDisp(){
        return "Printing from protected...";
    }

    @RequestMapping("/adminuser")
    public String adminDisp(){
        return "Printing from admin...";
    }

}