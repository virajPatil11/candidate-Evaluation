package com.snm.candidateevaluationapplication.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.snm.candidateevaluationapplication.model.Employee;
import com.snm.candidateevaluationapplication.repository.EmployeeRepository;
import com.snm.candidateevaluationapplication.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeRepository employeeRepository;

	@Override
	public Employee login(String empDasId, String empPassword) {
		
		return this.employeeRepository.login(empDasId, empPassword);
		
	}


}
