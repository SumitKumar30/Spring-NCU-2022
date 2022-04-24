package org.ncu.spring_mvc_jdbc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.spring_mvc_jdbc.Entity.Student;
import org.springframework.jdbc.core.RowMapper;

public class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setStudentId(rs.getInt("student_id"));
		student.setStudentName(rs.getString("student_name"));
		student.setStudentAddress(rs.getString("student_address"));
		return student;
	}

}
