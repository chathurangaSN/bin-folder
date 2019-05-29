 package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modal.Address;
import com.example.demo.modal.Employee;
import com.example.demo.modal.Project;
import com.example.demo.service.EmployeeService;

@RestController
@RequestMapping(value = "/emscloud")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@RequestMapping(value ="/employee",method = RequestMethod.POST)
	public Employee save(@RequestBody Employee employee){
		return employeeService.save(employee);
	}
	@RequestMapping(value ="/employee", method = RequestMethod.GET)
	public List<Employee> fetchAllEmployees(){
		return employeeService.fetchAllEmployees();
	}
	@RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
	public ResponseEntity<Employee> fetchEmployee(@PathVariable Integer id){
		Employee employee = new Employee();
		employee.setId(id);
		Employee employee2 = employeeService.fetchEmployee(employee);
		if(employee2 ==null){
			return ResponseEntity.notFound().build();
		}else{
			return ResponseEntity.ok(employee2);
		}
		
	}
	@RequestMapping(value = "/employee/{id}/projects",method = RequestMethod.GET)
	public ResponseEntity<List<Project>> fetchEmployeeProject(@PathVariable Integer id){
		Employee employee = new Employee();
		employee.setId(id);
		Employee employee2 = employeeService.fetchEmployee(employee);
		if(employee2 ==null){
			return ResponseEntity.notFound().build();
		}else{
			return ResponseEntity.ok(employee2.getProjects());
		}
	}
	@RequestMapping(value = "/employee/{id}/address",method = RequestMethod.GET)
	public ResponseEntity<Address> fetchEmployeeAddress(@PathVariable Integer id){
		Employee employee = new Employee();
		employee.setId(id);
		Employee employee2 = employeeService.fetchEmployee(employee);
		if(employee2 ==null){
			return ResponseEntity.notFound().build();
		}else{
			return ResponseEntity.ok(employee2.getAdress());
		}
	}
	
	
	@RequestMapping(value = "employee")
	public Employee test(){
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Sachith");
		Address address = new Address();
		address.setId(1);
		address.setAddress1("Gintota");
		address.setCity("Galle");
		employee.setAdress(address);
		return employee;
	}
	@RequestMapping(value = "employee2")
	public ResponseEntity<Employee> test2(){
		Integer x = 2;
		if(x==null){
			Employee employee = new Employee();
			employee.setId(1);
			employee.setName("Sachith");
			Address address = new Address();
			address.setAddress1("Gintota");
			address.setCity("Galle");
			employee.setAdress(address);
			return ResponseEntity.ok(employee);
		}
		else{
			HttpHeaders httpHeaders = new HttpHeaders();
			httpHeaders.add("status", "invalid-status");
			return ResponseEntity.notFound().headers(httpHeaders).build();
		}
			
	}
}
