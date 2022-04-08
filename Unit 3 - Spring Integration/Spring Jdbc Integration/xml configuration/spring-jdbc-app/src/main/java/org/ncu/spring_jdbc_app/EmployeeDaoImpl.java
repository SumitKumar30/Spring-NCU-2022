package org.ncu.spring_jdbc_app;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;
	
	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}
	@Override
	public void createRecord(Employee emp) {
		// TODO Auto-generated method stub
		String query = "insert into employee values(?,?,?,?)";
		Object records[] = {emp.getId(), emp.getName(), emp.getSalaary(), emp.getAddress()}; 
		jdbcTemplate.update(query, records);
		System.out.println("Records added successfully! "+emp.getName());
	}
	public List<Employee> fetchAllRecords() {
		// TODO Auto-generated method stub
		String query = "select * from employee";
		RowMapper<Employee> rowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(query, rowMapper);
		return employees;
		
	}

	@Override
	public void updateRecordById(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteRecordById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public Employee fetchRecordById(int id) {
		
		/* jdbcTemplate.queryForObject(sql, requiredType, args) */
		// TODO Auto-generated method stub
		return null;
	}

}
