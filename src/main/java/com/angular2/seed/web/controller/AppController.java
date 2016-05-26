package com.angular2.seed.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ashokgudise on 5/26/16.
 */
@Controller
public class AppController {

    @RequestMapping(value = "/")
    public String home(){
        return "index.html";
    }
}
