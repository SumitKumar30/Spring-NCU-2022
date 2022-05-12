package org.ncu.spring_aop_demo.dao;

import java.util.List;

import org.ncu.spring_aop_demo.entity.Account;

public interface AccountDao {
	public void addAccount();
	
	public void addAccount(Account account);
	
	public void addAccount(Account account, boolean vipFlag);
	
	public boolean doStuff();
	
	public String getAccountName();
	
	public int getAccountNo();
	
	// add a new method: findAccounts()
	List<Account> findAccounts(boolean tripWire);
}
