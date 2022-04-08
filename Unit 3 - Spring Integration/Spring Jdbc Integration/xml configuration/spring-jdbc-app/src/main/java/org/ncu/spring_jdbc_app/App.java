package org.ncu.spring_jdbc_app;

import java.util.List;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Create a spring container 
		
    	ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    	
    	// call the required beans
    	EmployeeDao dao = context.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
    	
    	Employee emp = context.getBean("employee", Employee.class);
    	
    	// invoke bean methods
    	
    	emp.setId(102);
    	emp.setName("Tom");
    	emp.setSalaary(500000);
    	emp.setAddress("Mumbai");
    	
    	dao.createRecord(emp);
    	
		/* fetching all the employee records */
    	System.out.println("============ Fetching Employee Records ==============");
    	
    	List<Employee> employees = dao.fetchAllRecords();
    	
    	for(Employee e : employees) {
    		System.out.println(e);
    	}
    	
    	// close the context
    	context.close();
    }
}
