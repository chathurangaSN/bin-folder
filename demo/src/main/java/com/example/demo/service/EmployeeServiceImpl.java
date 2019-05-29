package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modal.Employee;
import com.example.demo.modal.Telephone;
import com.example.demo.repository.EmployeeRepository;


@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	
	@Override
	public Employee save(Employee employee){
		
		for(Telephone telephone:employee.getTelephones()){
			telephone.setEmployee(employee);
		}
		return employeeRepository.save(employee);
	}
	@Override
	public List<Employee> fetchAllEmployees(){
		return employeeRepository.findAll();
	}
	
	public Employee fetchEmployee(Employee employee){
		Optional<Employee> optional = employeeRepository.findById(employee.getId());
		if(optional.isPresent()){
			return optional.get();
		}else{
			return null;
		}
	}

}
