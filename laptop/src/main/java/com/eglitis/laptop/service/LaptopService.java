package com.eglitis.laptop.service;

import com.eglitis.laptop.model.Laptop;
import com.eglitis.laptop.repository.ILaptopRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class LaptopService {
    private final ILaptopRepository LaptopRepository;

    public ResponseEntity<List<Laptop>> GetLaptop(){
        return ResponseEntity.ok(LaptopRepository.findAll());
    }

    public ResponseEntity<Object> getLaptopById(Integer id){
        var laptop = LaptopRepository.findById(id);

        if(laptop.isPresent()){
            return ResponseEntity.ok(laptop.get());
        } else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }

    public ResponseEntity<Double> CalculateTotalLaptopPrices(){
        var laptops = LaptopRepository.findAll();
        Double price = 0.0;
        for(var i:laptops){
            price += i.getPrice();
        }

        return ResponseEntity.ok(price);
    }
}
