package org.ncu.spring_jdbc_app;

import java.util.ArrayList;
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
    	
    	Employee emp1 = context.getBean("employee", Employee.class);
    	Employee emp2 = context.getBean("employee", Employee.class);
    	Employee emp3 = context.getBean("employee", Employee.class);
    	Employee emp4 = context.getBean("employee", Employee.class);
    	
    	emp1.setId(110);
    	emp1.setName("Spiderman");
    	emp1.setSalaary(50000);
    	emp1.setAddress("New York");
    	
    	emp2.setId(111);
    	emp2.setName("Ironman");
    	emp2.setSalaary(1000000);
    	emp2.setAddress("New York");
    	
    	emp3.setId(112);
    	emp3.setName("Superman");
    	emp3.setSalaary(5000);
    	emp3.setAddress("New Jersey");
    	
    	emp4.setId(114);
    	emp4.setName("Black Adam");
    	emp4.setSalaary(560000);
    	emp4.setAddress("Alien Planet");
    	
    	
    	List<Employee> empList = new ArrayList<>();
    	empList.add(emp1);
    	empList.add(emp2);
    	empList.add(emp3);
    	empList.add(emp4);
    	
    	dao.insertBatchRecords(empList);
    	
    	// invoke bean methods
    	
    	/*emp.setId(106);
    	emp.setName("Batman");
    	emp.setSalaary(8000000);
    	emp.setAddress("Gotham");
    	
    	dao.createRecord(emp);
    	*/
		/* fetching all the employee records */
    	System.out.println("============ Fetching Employee Records ==============");
    	
    	List<Employee> employees = dao.fetchAllRecords();
    	
    	for(Employee e : employees) {
    		System.out.println(e);
    	}
    	
    	System.out.println("======= Fethcing record by id ========");
    	System.out.println(dao.fetchRecordById(100));
    	
    	// close the context
    	context.close();
    }
}
