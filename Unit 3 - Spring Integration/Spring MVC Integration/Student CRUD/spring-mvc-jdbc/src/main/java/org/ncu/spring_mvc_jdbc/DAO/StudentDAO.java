package org.ncu.spring_mvc_jdbc.DAO;

import java.util.List;

import org.ncu.spring_mvc_jdbc.Entity.Student;

public interface StudentDAO {
	
	// method for fetching all the student records from the database
	public List<Student> loadStudents();
	
	// method for adding a record into the database
	public int createRecord(Student std);
	
	// method to update an existing record
	public int updateRecord(Student std);
	
	// method to fetch a single student record
	public Student getStudent(int id);
	
	// method to delete a student record from the database
	public void deleteStudent(int id);
}
