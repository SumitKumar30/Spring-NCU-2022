package org.ncu.spring_jdbc_mvc.controller;

import java.util.List;

import org.ncu.spring_jdbc_mvc.dao.EmployeeDao;
import org.ncu.spring_jdbc_mvc.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class EmployeeController {
	@Autowired
	private EmployeeDao employeeDao;
	
	@ModelAttribute("employee")
	public Employee getEmployee() {
		return new Employee();
	}
	
	/* Controller mapping for showing the employee input form */
	@GetMapping("/showEmployeeForm")
	public String showEmployeeForm() {
		return "employee-form";
	}
	
	/* Controller mapping for processing the create/insert operation */
	@PostMapping("/processForm")
	public String showProcessForm(@ModelAttribute("employee") Employee emp) {
		
		if(employeeDao.createRecord(emp) == 1) {
			System.out.println("Record inserted succesfully!");
		}else {
			System.out.println("Error inserting record!!");
		}
		
		
		return "confirmation";
	}
	
	/* Controller mapping for showing the student list dashboard */
	@RequestMapping(value = "/showEmployee", method = RequestMethod.GET)
	public String showEmployeeList(Model model) {
		List<Employee> empList = employeeDao.loadEmployees();
		model.addAttribute("employees", empList);
		return "employee-list";
	}
}
