package org.ncu.spring_jdbc_app;

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
    	
    	emp.setId(100);
    	emp.setName("John");
    	emp.setSalaary(10000);
    	emp.setAddress("New Delhi");
    	
    	dao.createRecord(emp);
    	
    	// close the context
    	context.close();
    }
}
