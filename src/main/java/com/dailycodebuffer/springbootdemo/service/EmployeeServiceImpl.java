package com.dailycodebuffer.springbootdemo.service;

import com.dailycodebuffer.springbootdemo.error.EmployeeNotFoundException;
import com.dailycodebuffer.springbootdemo.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    List<Employee> employees = new ArrayList<>();
    @Override
    public Employee save(Employee employee) {
        if(employee.getEmloyeeId() == null || employee.getEmloyeeId().isEmpty()) {
            employee.setEmloyeeId(UUID.randomUUID().toString());
        }
        employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> getAllEmployees() {
        return employees;
    }

    @Override
    public Employee getEmployeeById(String id) {
        return employees.stream()
                .filter(employee -> employee.getEmloyeeId().equalsIgnoreCase(id))
                .findFirst()
                .orElseThrow(() ->new EmployeeNotFoundException(""+"Employee not found with Id: "+ id));
    }

    @Override
    public String deleteEmployeeById(String id) {
       Employee employee =  employees.stream()
                .filter(e -> e.getEmloyeeId().equalsIgnoreCase(id))
                .findFirst()
                .get();
        employees.remove(employee);
        return "Employee deleted with the id "+ id;
    }
}
