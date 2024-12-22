package com.ryu.note.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
@CrossOrigin
public class CheckController {
    @GetMapping("/check-connection")
    public ResponseEntity<String> testConnection() {
        return ResponseEntity.ok("Connection to server is successful! Hello, World! :)");
    }

}
