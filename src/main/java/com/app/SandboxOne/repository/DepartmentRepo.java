package com.app.SandboxOne.repository;

import com.app.SandboxOne.model.Department;
import com.app.SandboxOne.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Set;

@Repository
public interface DepartmentRepo extends JpaRepository<Department,String> {


}
