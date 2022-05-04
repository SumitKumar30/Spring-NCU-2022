package org.ncu.spring_aop_demo.dao;

import org.ncu.spring_aop_demo.entity.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Repository
public class AccountDaoImpl implements AccountDao {

	@Override
	public void addAccount() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" - Account added to the database!\n");
	}

	@Override
	public void addAccount(Account account) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" - Account added for the given entity!\n");
	}

	@Override
	public void addAccount(Account account, boolean vipFlag) {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" - VIP account added for the given entity!\n");
	}

	@Override
	public boolean doStuff() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" - doing some stuff..\n");
		return true;
	}

	@Override
	public String getAccountName() {
		// TODO Auto-generated method stub
		System.out.println(this.getClass()+" - get account name!\n");
		return "John";
	}

	@Override
	public int getAccountNo() {
		// TODO Auto-generated method stub
		int number = 123;
		System.out.println(this.getClass()+" - get account number!\n");
		return number;
	}

}
