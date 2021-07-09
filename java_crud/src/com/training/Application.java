package com.training;

import java.sql.*;
import java.util.*;

import com.training.daos.CustomerRepository;
import com.training.model.Customer;
import com.training.util.DBConnection;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection con = DBConnection.getConnection();
		CustomerRepository dao = new CustomerRepository(con);
		int ch=3;
		try {
			if(ch==1) {
				dao.add(new Customer(1,"Ramesh","ram@abc.com"));
				dao.add(new Customer(2,"Suresh","suresh@abc.com"));
				
				
			}
			if(ch==2)
			{
				List<Customer> list = dao.findAll();
				for(Customer eachCustomer:list)
				{
					System.out.println(eachCustomer);
				}
				
			}
			if(ch==3)
			{
				Customer c = dao.findById(1);
				System.out.println(c);
			}
			if(ch==4)
			{
				if(dao.remove(1)==1)
				{
					System.out.println("Customer removed");
				}
				else
				{
					System.out.println("Customer doesn't exist");
				}
				
			}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		

	}

}
