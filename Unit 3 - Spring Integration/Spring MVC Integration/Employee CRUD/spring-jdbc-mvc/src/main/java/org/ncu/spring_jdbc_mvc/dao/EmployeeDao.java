package org.ncu.spring_jdbc_mvc.dao;

import java.util.List;

import org.ncu.spring_jdbc_mvc.entity.Employee;

public interface EmployeeDao {
		// method for fetching all the student records from the database
		public List<Employee> loadEmployees();
		
		// method for adding a record into the database
		public int createRecord(Employee std);
		
		// method to update an existing record
		public int updateRecord(Employee std);
		
		// method to fetch a single record
		public Employee getRecord(int id);
		
		// method to delete a record from the database
		public void deleteRecord(int id);
}
