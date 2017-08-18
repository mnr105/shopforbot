package com.travel.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class SecController {

    @RequestMapping(value = "/ceva", method = RequestMethod.GET)
    public String index() {
        return "about.html";
    }

    @RequestMapping(value = "/altcv", method = RequestMethod.GET)
    public ModelAndView about() {
        ModelAndView model = new ModelAndView("single.html");
        return model;
    }
}
