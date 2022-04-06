package org.ncu.spring_jdbc_app;

import org.springframework.jdbc.core.JdbcTemplate;

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
	public Employee fetchRecord() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateRecord(int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public String deleteRecord(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
