package com.example.cgn231gitadvanced.controller;

import com.example.cgn231gitadvanced.JohannesStuff;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Johannes")
public class JohannesController {
    @GetMapping("/hi")
    public static String sayHello(){
        return JohannesStuff.startJohannes();
    }
}
