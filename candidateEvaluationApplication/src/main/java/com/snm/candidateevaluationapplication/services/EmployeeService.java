package com.snm.candidateevaluationapplication.services;

import com.snm.candidateevaluationapplication.model.Employee;

public interface EmployeeService {
	
	Employee login(String empDasId, String empPassword);

}
