package com.app.SandboxOne.services;

import com.app.SandboxOne.model.Employee;
import com.app.SandboxOne.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.ws.ServiceMode;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeesService {

    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeesOverSalary(int baseSalary){
        List<Employee> employees = employeeRepo.getAll();

        if(employees.size()==0)
            return employees;

        return employees.stream().filter(employee -> employee.getSalary()>baseSalary).collect(Collectors.toList());

    }
}
