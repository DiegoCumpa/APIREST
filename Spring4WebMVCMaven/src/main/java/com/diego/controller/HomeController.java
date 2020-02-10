package com.diego.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jcumpale on 7/05/2019.
 */
@Controller
public class HomeController {
    @RequestMapping(value = "/")
    public String Home(){
        return "test";
    }
}
