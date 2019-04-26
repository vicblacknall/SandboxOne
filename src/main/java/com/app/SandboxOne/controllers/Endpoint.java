package com.app.SandboxOne.controllers;


import com.app.SandboxOne.model.Employee;
import com.app.SandboxOne.repository.DepartmentRepo;
import com.app.SandboxOne.repository.EmployeeRepo;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
public class Endpoint {

    @Autowired
    DepartmentRepo departmentRepo;
    
    @Autowired
    EmployeeRepo employeeRepo;

    @GetMapping(value = "/")
    public ResponseEntity testPoint(/*@RequestHeader("API_KEY") String apiKey*/) {

      /*  if (apiKey.equals("123456")) {
            return ResponseEntity.status(403).body("Access Forbidden");
        }*/
        log.info(employeeRepo.findAll());
        return ResponseEntity.ok().header("Custom-Header", "ValueOfHeader").body("you made it");
    }
}
