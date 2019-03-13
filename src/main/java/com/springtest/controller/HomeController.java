package com.springtest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public ModelAndView dashboard(){
        ModelAndView modelAndView = new ModelAndView("index");
        return modelAndView;
    }
}
