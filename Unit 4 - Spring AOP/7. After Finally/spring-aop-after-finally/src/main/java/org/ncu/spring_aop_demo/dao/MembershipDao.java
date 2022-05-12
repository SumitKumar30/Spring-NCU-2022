package org.ncu.spring_aop_demo.dao;

import org.springframework.stereotype.Repository;

@Repository
public class MembershipDao {
	public void addAccount() {
		System.out.println(this.getClass()+": Doing stuff: adding a membership account!\n");
	}
	
	public void addMember() {
		System.out.println(this.getClass()+": Doing stuff - adding some members!\n");
	}
	
	public boolean addSillyMember() {
		System.out.println(this.getClass()+": Doing stuff - adding some silly member!\n");
		return true;
	}
	
	public void deleteMember() {
		System.out.println(this.getClass()+": Doing stuff - deleting a member!\n");
	}
}
