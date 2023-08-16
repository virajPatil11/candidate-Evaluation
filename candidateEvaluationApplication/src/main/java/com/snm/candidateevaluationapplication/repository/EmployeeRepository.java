package com.snm.candidateevaluationapplication.repository;

import com.snm.candidateevaluationapplication.model.Employee;

public interface EmployeeRepository {
	
	Employee login(String empDasId, String empPassword);

}
