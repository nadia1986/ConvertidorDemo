package com.example.convertidor.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConvertidorController {
    @GetMapping("/convertir/{galones}")
    public String galonesLitros(@PathVariable double galones){
        double litros= galones * 378541;
        return   "La cantidad de litros es: " + litros ;

    }
}
