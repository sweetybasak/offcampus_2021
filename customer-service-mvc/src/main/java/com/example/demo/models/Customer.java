package com.example.demo.models;

import org.springframework.stereotype.Component;

//9. to make it Spring Bean
@Component
//10. Create CustomerController class
public class Customer{

	private int id;
	private String customerName;
	private String email;
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int id, String customerName, String email) {
		super();
		this.id = id;
		this.customerName = customerName;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Customer [id=" + id + ", customerName=" + customerName + ", email=" + email + "]";
	}
	
	
	
	
}
