package com.example.lab1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.SQLOutput;

@Controller
public class HomeController {

    @RequestMapping(value ={ "/principal"},method = RequestMethod.GET)
    public String holaMundo(){
        return "principal";
    }

}