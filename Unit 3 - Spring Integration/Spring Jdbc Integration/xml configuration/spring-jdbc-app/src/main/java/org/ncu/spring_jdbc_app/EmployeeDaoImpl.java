package org.ncu.spring_jdbc_app;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeDaoImpl implements EmployeeDao {
	private JdbcTemplate jdbcTemplate;

	public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override

	public void createRecord(Employee emp) { // TODO Auto-generated method stub
		String query = "insert into employee values(?,?,?,?)";
		Object records[] = { emp.getEmployee_id(), emp.getEmployee_name(), emp.getEmployee_salary(),
				emp.getEmployee_address() };
		jdbcTemplate.update(query, records);
		System.out.println("Records added successfully! " + emp.getEmployee_name());
	}

	public List<Employee> fetchAllRecords() {
		// TODO Auto-generated method stub
		String query = "select * from employee";
		RowMapper<Employee> rowMapper = new EmployeeRowMapper();
		List<Employee> employees = jdbcTemplate.query(query, new BeanPropertyRowMapper<Employee>(Employee.class));
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
		String query = "select * from employee where employee_id = ?";
		RowMapper<Employee> rowMapper = new EmployeeRowMapper();
		Employee emp = jdbcTemplate.queryForObject(query, rowMapper, id);

		return emp;
	}

	@Override
	public boolean deleteAllRecords() {
		// TODO Auto-generated method stub
		String query = "truncate table employee";
//		jdbcTemplate.update(query);
		jdbcTemplate.execute(query);
		return false;
	}

	@Override
	public void insertBatchRecords(List<Employee> employees) { // TODO
		// Auto-generated method stub
		String query = "insert into employee values (?, ?, ?, ?)";
		List<Object[]> batchArgs = new ArrayList<>();

		for (Employee emp : employees) {
			Object[] args = { emp.getEmployee_id(), emp.getEmployee_name(), emp.getEmployee_salary(),
					emp.getEmployee_address() };
			batchArgs.add(args);
		}

		jdbcTemplate.batchUpdate(query, batchArgs);
		System.out.println("Batch insertion successfull!");
	}

	@Override
	public List<Employee> fetchRecordByName(String name) {
		// TODO Auto-generated method stub
		String query = "select * from employee where employee_name = ?";
		List<Employee> empList = jdbcTemplate.query(query, new EmployeeResultSetExtractor(), name);
		return empList;
	}

}
