package com.app.SandboxOne.repository;

import com.app.SandboxOne.model.Employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmployeeRepo extends CrudRepository<Employee,Long> {

List<Employee> getAllByDepartment(String dep);
@Query(value = "select * from employees", nativeQuery = true)
List<Employee> getAll();
Employee getEmployeeByEmpID(long id);
}
