package com.towfiq.api_element.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author TOWFIQUL ISLAM
 * @since 10/07/2021 23:51
 */

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping()
    public String getIndex(){
        return "index";
    }

    @PostMapping("/")
    public String postIndex(){
        return "redirect:/";
    }


}
