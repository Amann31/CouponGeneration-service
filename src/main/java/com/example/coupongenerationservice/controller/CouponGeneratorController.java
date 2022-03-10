package com.example.coupongenerationservice.controller;


import com.example.coupongenerationservice.model.CouponGenerator;
import com.example.coupongenerationservice.service.GeneratorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CouponGeneratorController {
    private final GeneratorService generatorService;

    public CouponGeneratorController(GeneratorService generatorService) {
        this.generatorService = generatorService;
    }

    @GetMapping("/generates")
    public CouponGenerator createCouponGenerator() {
        return generatorService.generateCoupon();
    }

}
