package com.app.SandboxOne.controllers;


import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class Endpoint {


    @GetMapping(value = "/")
    public ResponseEntity testPoint(@RequestHeader("API_KEY") String apiKey) {

        if (!apiKey.equals("123456")) {
            return ResponseEntity.status(403).body("Access Forbidden");
        }

        return ResponseEntity.ok().header("Custom-Header", "ValueOfHeader").body("you made it");
    }
}
