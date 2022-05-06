package org.ncu.spring_aop_demo.dao;

import java.util.ArrayList;
import java.util.List;

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

	// added new method: findAccounts()
	@Override
	public List<Account> findAccounts() {
		// TODO Auto-generated method stub
		List<Account> accountList = new ArrayList<>();
		
		//create sample accounts
		Account temp1 = new Account("John", "Platinum");
		Account temp2 = new Account("Fernando", "Gold");
		Account temp3 = new Account("Sarah", "Gold");
		Account temp4 = new Account("Linc", "Silver");
		
		// add them to our account list
		accountList.add(temp1);
		accountList.add(temp2);
		accountList.add(temp3);
		accountList.add(temp4);
		
		return accountList;
	}

}
