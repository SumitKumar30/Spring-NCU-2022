package org.ncu.spring_jdbc_app;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salaary=" + salaary + ", address=" + address + "]";
	}
	private int id;
	private String name;
	private int salaary;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalaary() {
		return salaary;
	}
	public void setSalaary(int salaary) {
		this.salaary = salaary;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
}
