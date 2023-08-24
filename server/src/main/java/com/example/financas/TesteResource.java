package com.example.financas;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/teste")
@CrossOrigin
public class TesteResource {

    @GetMapping
    public ResponseEntity<String> teste() {
        return ResponseEntity.ok("funcionou");
    }
}
