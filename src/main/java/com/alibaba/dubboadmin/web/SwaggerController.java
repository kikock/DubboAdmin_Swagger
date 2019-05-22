package com.alibaba.dubboadmin.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/swagger")
public class SwaggerController {
    @RequestMapping("/ui")
    public ModelAndView pageAdd() {
        return new ModelAndView("index");
    }
}
