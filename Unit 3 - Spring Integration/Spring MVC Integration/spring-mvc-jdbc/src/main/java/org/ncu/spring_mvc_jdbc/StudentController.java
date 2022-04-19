package org.ncu.spring_mvc_jdbc;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.ncu.spring_mvc_jdbc.DAO.StudentDAO;
import org.ncu.spring_mvc_jdbc.DAO.StudentDAOImpl;
import org.ncu.spring_mvc_jdbc.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class StudentController {
	/* StudentDAO studentDao = new StudentDAOImpl(); */
	// Spring has already created the bean/object of StudentDAOImpl using @Repository
	// so, we can inject the DAO object directly using @Autowired
	@Autowired
	private StudentDAO studentDao;
	
	@ModelAttribute("student")
	public Student getStudent(HttpServletRequest request) {
		 
		return new Student();
	}
	
	@RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String showStudentsList(Model model) {
		List<Student> studentList = studentDao.loadStudents();
		for(Student tempStudent : studentList) {
			System.out.println(tempStudent);
		}
		model.addAttribute("students", studentList);
		return "student-list";
	}
	
	@GetMapping("/showStudentForm")
	public String showStudentForm() {
		return "student-form";
	}
	
	@PostMapping("/processForm")
	public String showProcessForm(@ModelAttribute("student") Student student) {
		if(studentDao.createRecord(student) == 1) {
			System.out.println("Records updated successfully");
		}else {
			System.out.println("Error Occurred!!");
		}
		
		return "confirmation";
	}
}
