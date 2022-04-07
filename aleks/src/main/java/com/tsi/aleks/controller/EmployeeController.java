package com.tsi.aleks.controller;

import com.tsi.aleks.model.Employee;
import com.tsi.aleks.repository.EmployeeRepositary;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class EmployeeController {

    private final EmployeeRepositary employeeRepositary;

    @GetMapping("/employee")
    public ResponseEntity<List<Employee>> getAllEmployee(){

        return ResponseEntity.ok(employeeRepositary.findAll());
    }

    @GetMapping("/employee/{id}")
    public ResponseEntity<Employee> getAllEmployeeId(@PathVariable Long id){
        return employeeRepositary.findById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.status(HttpStatus.NOT_FOUND).build());
    }

    @DeleteMapping("/employee/{id}")
    public ResponseEntity deleteEmployeeById(@PathVariable Long id){
        employeeRepositary.deleteById(id);

        return ResponseEntity.status(HttpStatus.ACCEPTED).build();
    }

    @PostMapping("/employee")
    public ResponseEntity<Employee> addEmployee(@RequestBody Employee employee){
        var saveEmployee = employeeRepositary.save(employee);

        return ResponseEntity.status(HttpStatus.CREATED)
                .body(saveEmployee);
    }
}
