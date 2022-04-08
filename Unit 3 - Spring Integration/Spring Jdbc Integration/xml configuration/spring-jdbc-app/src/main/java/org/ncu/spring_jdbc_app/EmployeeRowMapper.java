package org.ncu.spring_jdbc_app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setId(rs.getInt("employee_id"));
		employee.setName(rs.getString("employee_name"));
		employee.setSalaary(rs.getInt("employee_salary"));
		employee.setAddress(rs.getString("employee_address"));
		
		return employee;
	}

}
