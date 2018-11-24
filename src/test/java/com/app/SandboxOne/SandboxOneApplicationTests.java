package com.app.SandboxOne;

import com.app.SandboxOne.model.Employee;
import com.app.SandboxOne.repository.EmployeeRepo;
import com.app.SandboxOne.services.EmployeesService;
import com.app.SandboxOneApplication;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.function.Consumer;

@Slf4j
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SandboxOneApplication.class)
public class SandboxOneApplicationTests {

	@Autowired
	EmployeeRepo employeeRepo;

	@Autowired
    EmployeesService employeesService;

	@Test
	public void contextLoads() {
	}

    //@Ignore
	@Test
	public void getEmpByDept(){
		List<Employee> employeeList = employeeRepo.getAllByDepartment("sales");

		Assert.assertTrue("at least someone was returned",employeeList.size()>0);

	}

    @Test
    public void getEveryone(){
        List<Employee> employeeList = employeeRepo.getAll();

        Assert.assertTrue("many people were return",employeeList.size()>5);

    }

    @Test
    public void getFatCats(){
	    int baseSalary = 7000000;
        List<Employee> employeeList = employeesService.getEmployeesOverSalary(baseSalary);

        Consumer<Employee> checkSalary = employee -> {Assert.assertTrue(employee.getSalary()>baseSalary);};

        employeeList.forEach(checkSalary);

    }

    @Test
    public void getEmpById(){
        Employee employee = employeeRepo.getEmployeeByEmpID(156321579);

        Assert.assertNotEquals("at least someone was pulled back",employee,null);
        Assert.assertEquals("micheal should have been pulled back", "Smith",employee.getLastName());

    }
}
