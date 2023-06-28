package com.aiotech.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DemoController {

    @GetMapping("/message")
    public String message(){
        return "Congrats! You have successfully deployed your application in Azure Cloud!";
    }
}
