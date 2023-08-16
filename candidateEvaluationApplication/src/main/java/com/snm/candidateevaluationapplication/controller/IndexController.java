package com.snm.candidateevaluationapplication.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.snm.candidateevaluationapplication.model.Employee;
import com.snm.candidateevaluationapplication.services.EmployeeService;


@Controller
public class IndexController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping(value = "/")
	public String index() {
		return "index"; 	// WEB-INF/views/index.jsp
	}
	
	@PostMapping(value = "/login")
	public String doLogin(Model model, @RequestParam String empDasId, @RequestParam String empPassword, HttpSession httpSession) {
		try {
			Employee current_employee = employeeService.login(empDasId, empPassword);
			httpSession.setAttribute("current_employee", current_employee);
			System.out.println(current_employee);
			return "redirect:candidate/candidate-list";
		} catch (EmptyResultDataAccessException e) {
			model.addAttribute("error_message", "Invalid DAS ID or Password.");
			return "index";
		}
	}
	
	@GetMapping("/logout")
	public String logout(HttpSession httpSession) {
		httpSession.invalidate();
		return "index";
	}

}
