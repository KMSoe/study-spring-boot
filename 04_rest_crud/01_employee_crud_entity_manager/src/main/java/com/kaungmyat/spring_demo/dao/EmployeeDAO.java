package com.kaungmyat.spring_demo.dao;

import com.kaungmyat.spring_demo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> findAll();

    Employee findById(int id);

    Employee save(Employee employee);

    void deleteById(int id);
}
