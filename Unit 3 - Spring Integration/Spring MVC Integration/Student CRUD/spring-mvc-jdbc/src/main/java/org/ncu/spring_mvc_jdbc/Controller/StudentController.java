package org.ncu.spring_mvc_jdbc.Controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.ncu.spring_mvc_jdbc.DAO.StudentDAO;
import org.ncu.spring_mvc_jdbc.DAO.StudentDAOImpl;
import org.ncu.spring_mvc_jdbc.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
	/* StudentDAO studentDao = new StudentDAOImpl(); */
	// Spring has already created the bean/object of StudentDAOImpl using @Repository
	// so, we can inject the DAO object directly using @Autowired
	@Autowired
	private StudentDAO studentDao;
	
	/* Creating domain object/bean for data binding */
	@ModelAttribute("student")
	public Student getStudent() {
		 
		return new Student();
	}
	
	/* Controller mapping for showing the student input form */
	@GetMapping("/showStudentForm")
	public String showStudentForm() {
		return "student-form";
	}
	
	/* Controller mapping for processing the create/insert operation */
	@PostMapping("/processForm")
	public String showProcessForm(@ModelAttribute("student") Student student) {
		if(studentDao.createRecord(student) == 1) {
			System.out.println("Records updated successfully");
		}else {
			System.out.println("Error Occurred!!");
		}
		
		return "confirmation";
	}
	
	/* Controller mapping for showing the student list dashboard */
	@RequestMapping(value = "/showStudent", method = RequestMethod.GET)
	public String showStudentsList(Model model) {
		List<Student> studentList = studentDao.loadStudents();
		for(Student tempStudent : studentList) {
			System.out.println(tempStudent);
		}
		model.addAttribute("students", studentList);
		return "student-list";
	}
	
	/* Controller mapping for update form */
	@GetMapping("/updateForm")
	public String showUpdateForm(@RequestParam("stuId")int studentId, @ModelAttribute("student") Student student, Model model) {
		
		System.out.println("Getting the student data for id: "+studentId);
		student = studentDao.getStudent(studentId);
		/* send the student object to view */
		 model.addAttribute(student); 
		return "student-update-form";
	}
	
	/* Controller mapping for processing the update operation */
	@PostMapping("/processUpdate")
	public String processUpdateForm(@ModelAttribute("student") Student stu) {
		
		if(studentDao.updateRecord(stu) == 1) {
			System.out.println("Record update successfully!!");
		}else {
			System.out.println("Error!!!");
		}
		return "confirmation";
	}
	
	/* Controller mapping for processing the delete operation */
	@GetMapping("/deleteStudent")
	public String deleteStudent(@RequestParam("stuId")int id) {
		studentDao.deleteStudent(id);
		return "redirect:/showStudent";
	}
}
