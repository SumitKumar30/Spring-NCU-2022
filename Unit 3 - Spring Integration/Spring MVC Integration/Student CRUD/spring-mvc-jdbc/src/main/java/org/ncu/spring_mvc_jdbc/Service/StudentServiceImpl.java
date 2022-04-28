package org.ncu.spring_mvc_jdbc.Service;

import java.util.List;

import org.ncu.spring_mvc_jdbc.DAO.StudentDAO;
import org.ncu.spring_mvc_jdbc.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	private StudentDAO studentDao;
	
	@Override
	public List<Student> fetchStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList = studentDao.loadStudents();
		for(Student tempStudent : studentList) {
			System.out.println(tempStudent);
		}
		return studentList;
	}

	@Override
	public void saveStudent(Student std) {
		// TODO Auto-generated method stub
		int rowAdded = studentDao.createRecord(std);
		if(rowAdded == 1) {
			System.out.println("Record saved successfully");
		}else {
			System.out.println("Error Occurred!!");
		}
	}

	@Override
	public void editStudent(Student std) {
		// TODO Auto-generated method stub
		int rowUpdated = studentDao.updateRecord(std);
		if(rowUpdated == 1) {
			System.out.println("Record updated successfully");
		}else {
			System.out.println("Error Occurred!!");
		}
	}

	@Override
	public Student getOneStudent(int id) {
		// TODO Auto-generated method stub
		Student student = studentDao.getStudent(id);
		return student;
	}

	@Override
	public void deleteOneStudent(int id) {
		// TODO Auto-generated method stub
		studentDao.deleteStudent(id);
		System.out.println("Student with "+id+" is deleted successfully!!");
	}

}
