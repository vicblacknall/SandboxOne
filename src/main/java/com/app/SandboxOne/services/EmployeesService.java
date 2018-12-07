package com.app.SandboxOne.services;

import com.app.SandboxOne.model.Employee;
import com.app.SandboxOne.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
public class EmployeesService {



    @Autowired
    EmployeeRepo employeeRepo;

    public List<Employee> getEmployeesOverSalary(int baseSalary){

        List<Employee> employees = employeeRepo.getAll();

        if(!employees.isEmpty())
            return  employees;

        List<Employee> list = employees.stream().filter(employee -> employee.getSalary()>baseSalary).collect(Collectors.toList());
        return Optional.ofNullable(list).orElse(new ArrayList<>());

    }

    public Optional<List<Employee>> getOptEmployeesOverSalary(int baseSalary){

        List<Employee> employees = employeeRepo.getAll();

        if(employees.size()==0)
            return  Optional.ofNullable(employees);

        List<Employee> list = employees.stream().filter(employee -> employee.getSalary()>baseSalary).collect(Collectors.toList());

        return Optional.ofNullable(list);

    }

}
