package com.inz.webflux.inz.webflux.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

    @GetMapping("/dupa")
    public ResponseEntity test(){
        return ResponseEntity.ok("");
    }
}
