package org.ncu.spring_mvc_jdbc.DAO;

import java.util.ArrayList;
import java.util.List;

import org.ncu.spring_mvc_jdbc.Entity.Student;
import org.ncu.spring_mvc_jdbc.rowmapper.StudentRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@Override
	public List<Student> loadStudents() {
		// TODO Auto-generated method stub
		List<Student> studentList = new ArrayList<>();
		String query = "select * from student";
		studentList = jdbcTemplate.query(query, new StudentRowMapper());
		return studentList;
	}
	@Override
	public int createRecord(Student std) {
		// TODO Auto-generated method stub
		String query = "insert into student values(?,?,?)";
		Object records[] = { std.getStudentId(), std.getStudentName(), std.getStudentAddress() };
		int recordInserted = jdbcTemplate.update(query, records);
		return recordInserted;
	}

}
