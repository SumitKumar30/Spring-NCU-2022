package org.ncu.spring_aop_demo;

import org.ncu.spring_aop_demo.dao.AccountDao;
import org.ncu.spring_aop_demo.dao.AccountDaoImpl;
import org.ncu.spring_aop_demo.dao.MembershipDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	// Initializing the spring container
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        
        // request the spring bean from container
    	AccountDao dao = context.getBean("accountDaoImpl", AccountDaoImpl.class);
    	
    	// request the membership bean from spring container
    	MembershipDao memDao = context.getBean("membershipDao", MembershipDao.class);
    	
    	// call the membership method
    	memDao.addSillyMember();
    	
    	// call the target method
    	dao.addAccount();
    	
    	// close the context
    	context.close();
    }
}
