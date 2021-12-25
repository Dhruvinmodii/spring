package com.spring.core.spring;

public class student {
	
	public int id;
	public String name , address;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", address=" + address + "]";
	}
	
	
}
