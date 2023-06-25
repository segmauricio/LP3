package com.example.ecommerceElectronico.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mauricio
 */
@RestController
public class DemoController {
    @GetMapping("/demo")
    public String showDemo(){
        return "Hello World from Demo";
    }
}
