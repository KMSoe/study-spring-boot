package com.kaungmyat.spring_demo.service.impl;

import com.kaungmyat.spring_demo.dao.EmployeeRepository;
import com.kaungmyat.spring_demo.entity.Employee;
import com.kaungmyat.spring_demo.service.EmployeeService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private EmployeeRepository employeeRepository;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return this.employeeRepository.findAll();
    }

    @Override
    public Employee findById(int id) {
        Optional<Employee> result = employeeRepository.findById(id);

        Employee employee = null;

        if (result.isPresent()) {
            employee = result.get();
        }
        else {
            // we didn't find the employee
            throw new RuntimeException("Did not find employee id - " + id);
        }

        return employee;
    }

    @Transactional
    @Override
    public Employee save(Employee theEmployee) {
        return this.employeeRepository.save(theEmployee);
    }

    @Transactional
    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);
    }
}
