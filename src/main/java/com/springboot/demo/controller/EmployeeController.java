package com.springboot.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.demo.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/findall")
	public List<Employee> getEmployees() {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1, "Hari", "BhargaviC", "hari.kishore@gmail.com"));
		employeesList.add(new Employee(2, "Anil", "CharanC", "anil.kumar@gmail.com"));
		return employeesList;
	}

}
