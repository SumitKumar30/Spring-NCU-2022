package org.ncu.spring_jdbc_app;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

public class EmployeeResultSetExtractor implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		// TODO Auto-generated method stub
		

		List<Employee> empList = new ArrayList<>();
		while (rs.next()) {
			Employee employee = new Employee();
			employee.setEmployee_id(rs.getInt("employee_id"));
			employee.setEmployee_name(rs.getString("employee_name"));
			employee.setEmployee_salary(rs.getInt("employee_salary"));
			employee.setEmployee_address(rs.getString("employee_address"));
			/* System.out.println(employee); */
			empList.add(employee);
		}
		return empList;
	}

}
