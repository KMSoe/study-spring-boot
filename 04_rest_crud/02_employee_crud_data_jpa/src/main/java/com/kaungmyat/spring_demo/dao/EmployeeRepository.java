package com.kaungmyat.spring_demo.dao;

import com.kaungmyat.spring_demo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
