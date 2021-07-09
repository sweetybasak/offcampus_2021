package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.stereotype.Repository;

import com.example.demo.models.Customer;

//21. Add Annotation @Repository
@Repository
public class CustomerRepository {
	//22. Add JdbcTemplate and @Autowired to it for the Connections and JDBC structure
	@Autowired
	private JdbcTemplate template;
	
	//23. Add this method to getAllCustomers
	public List<Customer> getAllCustomers()
	{
		String sql = "select * from customer";
		List<Customer> custList =
				template.query(sql, BeanPropertyRowMapper.newInstance(Customer.class));
		return custList;
	}
	
	//24. go to CustomerController
	
	//27. for adding Customer
	public int addCustomer(Customer cust)
	{
		SimpleJdbcInsert inserter = new SimpleJdbcInsert(template);
		inserter.withTableName("customer").usingColumns("id","customername","email");
		BeanPropertySqlParameterSource sql = new BeanPropertySqlParameterSource(cust);
		return inserter.execute(sql);
	}

}
