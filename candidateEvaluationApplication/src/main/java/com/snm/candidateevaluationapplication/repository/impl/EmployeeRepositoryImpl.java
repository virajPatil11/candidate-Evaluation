package com.snm.candidateevaluationapplication.repository.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.snm.candidateevaluationapplication.model.Employee;
import com.snm.candidateevaluationapplication.repository.EmployeeRepository;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	String sqlQuery;

	@Override
	public Employee login(String empDasId, String empPassword) {
		
		sqlQuery = "SELECT * FROM cea_master_employee WHERE emp_das_id=? AND emp_password=?";
		
		RowMapper<Employee> empRowMapper = (rs, cnt) -> {
			Employee emp = new Employee();
			emp.setEmpId(rs.getInt("emp_id"));
			emp.setEmpName(rs.getString("emp_name"));
			emp.setEmpPhone(rs.getLong("emp_phone"));
			emp.setEmpEmail(rs.getString("emp_email"));
			emp.setEmpGcmLevel(rs.getInt("emp_gcm_level"));
			emp.setEmpDasId(rs.getString("emp_das_id"));
			emp.setEmpPassword(rs.getString("emp_password"));
			emp.setEmpRole(rs.getString("emp_role"));
			emp.setEmpManagerId(rs.getInt("emp_manager_id"));
			emp.setLogin(true);
			return emp;
		};
		
		Employee emp = this.jdbcTemplate.queryForObject(sqlQuery, empRowMapper, empDasId, empPassword);
		System.out.println(emp);
		return emp;
		
		
	}

}
