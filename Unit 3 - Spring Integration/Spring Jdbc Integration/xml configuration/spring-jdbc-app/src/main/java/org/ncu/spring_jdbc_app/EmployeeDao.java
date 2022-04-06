package org.ncu.spring_jdbc_app;

public interface EmployeeDao {
	
	// method for adding a record into the database
	public void createRecord(Employee emp);
	
	// method for reading a record from the database
	public Employee fetchRecord();
	
	// method for updating a record in the database
	public void updateRecord(int id);
	
	// method for deleting a record from the database
	public String deleteRecord(int id);
}
