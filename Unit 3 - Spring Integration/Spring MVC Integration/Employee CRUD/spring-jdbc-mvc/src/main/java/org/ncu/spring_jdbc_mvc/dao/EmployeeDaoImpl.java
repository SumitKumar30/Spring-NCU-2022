package org.ncu.spring_jdbc_mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.ncu.spring_jdbc_mvc.entity.Employee;
import org.ncu.spring_jdbc_mvc.rowmapper.EmployeeRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	@Override
	public List<Employee> loadEmployees() {
		// TODO Auto-generated method stub
		List<Employee> empList = new ArrayList<>();
		String query = "select * from employee";
		empList = jdbcTemplate.query(query, new EmployeeRowMapper());
		return empList;
	}

	@Override
	public int createRecord(Employee emp) {
		// TODO Auto-generated method stub
		String query = "insert into employee values(?,?,?,?)";
		Object records[] = { emp.getEmpId(), emp.getEmpName(), emp.getEmpSalary(), emp.getEmpAddress()};
		int recordInserted = jdbcTemplate.update(query, records);
		return recordInserted;
	}

	@Override
	public int updateRecord(Employee std) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Employee getRecord(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteRecord(int id) {
		// TODO Auto-generated method stub
		
	}

}
