package org.ncu.spring_jdbc_app;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee> {

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmployee_id(rs.getInt("employee_id"));
		employee.setEmployee_name(rs.getString("employee_name"));
		employee.setEmployee_salary(rs.getInt("employee_salary"));
		employee.setEmployee_address(rs.getString("employee_address"));
		
		return employee;
	}

}
