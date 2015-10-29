package com.springmvc.tutorial.controller;

import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.*;
import com.springmvc.tutorial.bo.bean.Employee;

@Controller
public class EmployeeSalaryDetails {
	
	@RequestMapping(value="secured/getSalaries", produces="application/json")
	@Secured("ROLE_ADMIN")
	@ResponseBody
	public List<Employee> getHelloWorld(){
		List<Employee> employees = new ArrayList<Employee>();
		System.out.println("employee salary rest service got executed");
		employees.add(new Employee("Rajesh", 20000.00d));
		employees.add(new Employee("Kannan", 30000.00d));
		employees.add(new Employee("Murugan", 40000.00d));
		return employees;
	}

}
