package org.ncu.spring_aop_demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDao {
	public void addAccount() {
		System.out.println(this.getClass()+": Doing stuff: adding a membership account!");
	}
	
	public void addMember() {
		System.out.println(this.getClass()+": Doing stuff - adding some members!");
	}
	
	public boolean addSillyMember() {
		System.out.println(this.getClass()+": adding some silly member!");
		return true;
	}
}
