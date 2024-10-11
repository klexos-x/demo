package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaController {
    @GetMapping("/hola/{nombre}")
    public String hola(@PathVariable String nombre) {
        return "Hola, " + nombre + "! Bienvenido!";
    }
}
