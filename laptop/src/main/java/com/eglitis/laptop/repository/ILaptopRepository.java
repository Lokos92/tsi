package com.eglitis.laptop.repository;

import com.eglitis.laptop.model.Laptop;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface ILaptopRepository extends JpaRepository<Laptop, Integer> {

}
