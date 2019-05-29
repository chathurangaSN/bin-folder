package com.example.demo.service;

import java.util.List;

import com.example.demo.modal.Employee;

public interface EmployeeService {

	Employee save(Employee employee);
	List<Employee> fetchAllEmployees();
	public Employee fetchEmployee(Employee employee);
}