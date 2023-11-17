package com.customerapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.customerapp.model.Customer;

import com.customerapp.repository.CustomerRepoImpl;

@Component
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepoImpl cust;

	@Override
	public Customer addCustomer(Customer c) {
		// TODO Auto-generated method stub

		cust.addCustomer(c);

		return c;

	}

	@Override
	public Customer getCustomerById(int id) {
		Customer c = cust.getCustomerById(id);
		return c;
	}

	@Override
	public Customer getCustomerByName(String name) {
		Customer c = cust.getCustomerByName(name);
		return c;
	}

	@Override
	public void deleteCustomer(int id) {
		cust.deleteCustomer(id);

	}

	@Override
	public List<Customer> getAllCustomers() {
		return cust.getAllCustomers();
	}

}
