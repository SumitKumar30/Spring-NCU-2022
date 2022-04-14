package org.ncu.spring_jdbc_app;

import java.util.List;

public interface EmployeeDao {
	
	// method for adding a record into the database
	public void createRecord(Employee emp);
	
	// method for reading a record from the database
	public List<Employee> fetchAllRecords();
	
	// method for updating a record in the database
	public void updateRecordById(int id);
	
	// method for deleting a record from the database
	public String deleteRecordById(int id);
	
	// method to fetch a record by id
	public Employee fetchRecordById(int id);
	
	// remove all the table records
	public boolean deleteAllRecords();
	
	// batch insertion
	public void insertBatchRecords(List<Employee> employees);
	
	// method for fetching records with same name
	public List<Employee> fetchRecordByName(String name);
}
