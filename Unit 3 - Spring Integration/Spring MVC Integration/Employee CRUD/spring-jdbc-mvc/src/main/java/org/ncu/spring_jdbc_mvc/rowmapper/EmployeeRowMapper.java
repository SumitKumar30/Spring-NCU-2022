package org.ncu.spring_jdbc_mvc.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.ncu.spring_jdbc_mvc.entity.Employee;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee employee = new Employee();
		employee.setEmpId(rs.getInt("employee_id"));
		employee.setEmpName(rs.getString("employee_name"));
		employee.setEmpSalary(rs.getInt("employee_salary"));
		employee.setEmpAddress(rs.getString("employee_address"));
		return employee;
	}

}
