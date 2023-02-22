package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class apicontroller {

String name = "Naveen";

@GetMapping("/")

public String getName() {

return "welcome" + name;

}

}