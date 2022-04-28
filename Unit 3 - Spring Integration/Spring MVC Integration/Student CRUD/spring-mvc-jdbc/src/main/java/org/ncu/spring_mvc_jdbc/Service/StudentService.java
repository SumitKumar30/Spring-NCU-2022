package org.ncu.spring_mvc_jdbc.Service;

import java.util.List;

import org.ncu.spring_mvc_jdbc.Entity.Student;

public interface StudentService {
	
		public List<Student> fetchStudents();
	
		public void saveStudent(Student std);
		
		public void editStudent(Student std);
		
		public Student getOneStudent(int id);
		
		public void deleteOneStudent(int id);
}
