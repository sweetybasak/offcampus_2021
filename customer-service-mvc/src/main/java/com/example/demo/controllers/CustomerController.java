package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.models.Customer;
import com.example.demo.repository.CustomerRepository;

@Controller
//10. Add Controller Annotation and initForm()
public class CustomerController {
	//13. Create an instance of Customer to pass command as object
	@Autowired
	private Customer customer;
	
	@Autowired
	private CustomerRepository repo;
	//11. Add RequestMapping
	//12. create a jsp addCustomer
	//14. Pass Model as parameter and call the method addAttribute
	@RequestMapping(value="/customers",method=RequestMethod.GET)
	public String initForm(Model model)
	{
		
		model.addAttribute("command",customer);
		//15 create a jsp file addCustomer
		return "addCustomer";
	}
	//18. Add submitForm Method
	//19. Add dependency OracleDriver and JDBC API
	//20. Create a Repository class
@RequestMapping(value="/customers",method=RequestMethod.POST)	
	public String submitForm(@ModelAttribute("command") Customer customer, Model model)
	{
		int rowAdded = repo.addCustomer(customer);
		model.addAttribute("rowAdded",rowAdded);
		return "addCustomer";
	}

	//25. calling the getAllCustomers
@RequestMapping(value="/customers/all",method=RequestMethod.GET)
	public String findAllCustomers(Model model)
	{
		List<Customer> list = repo.getAllCustomers();
		model.addAttribute("list",list);
		return "showCustomer";
		//26. create a showCustomer.jsp
	}
}
