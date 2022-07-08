package com.gonzalo.projectyrd.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ListingController {
    @GetMapping("/")
    @ResponseBody
    public String landing() {
        return "Hello World";
    }

    @GetMapping("/listings")
    public String allListings() {
        return "/listings/index";
    }

}
