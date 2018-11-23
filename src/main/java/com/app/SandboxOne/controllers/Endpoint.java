package com.app.SandboxOne.controllers;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Endpoint {


    @GetMapping("/")
    public ResponseEntity testPoint(){

        return ResponseEntity.ok().body("you made it");
    }

}
