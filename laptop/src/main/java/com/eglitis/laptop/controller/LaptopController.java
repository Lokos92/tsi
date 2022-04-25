package com.eglitis.laptop.controller;

import com.eglitis.laptop.model.Laptop;
import com.eglitis.laptop.service.LaptopService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class LaptopController {
    private final LaptopService laptopService;

    @GetMapping("/info")
    public ResponseEntity<String> Info(){
        return ResponseEntity.ok("Aleks Eglitis\n 4001BDA\n 4variant\n 25.04.2022");
    }

    @GetMapping("/getAll")
    public ResponseEntity<List<Laptop>> getAllLaptops(){
        return laptopService.GetLaptop();
    }

    @GetMapping("/get")
    public ResponseEntity getLaptopById(@RequestParam(name="id") Integer id){
        return laptopService.getLaptopById(id);
    }

    @GetMapping("/totalprice")
    public ResponseEntity getTotalLaptopsPrices(){
        return laptopService.CalculateTotalLaptopPrices();
    }

}
