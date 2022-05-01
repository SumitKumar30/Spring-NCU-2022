package org.ncu.spring_aop_demo.dao;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Override
	public void addAccount() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" - Account added to the database!");
	}

}
