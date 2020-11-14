package com.gerry.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

//Prefix the request mapping at the class level
@RequestMapping("/owners")
@Controller
public class OwnerController {
    @RequestMapping({"","/","/index","/index.html"})
    public String listVets(){
        return "owners/index";
    }
}
