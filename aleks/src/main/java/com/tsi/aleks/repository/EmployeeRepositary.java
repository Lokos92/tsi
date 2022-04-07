package com.tsi.aleks.repository;

import com.tsi.aleks.model.Employee;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface EmployeeRepositary extends JpaRepository<Employee, Long> {

}
