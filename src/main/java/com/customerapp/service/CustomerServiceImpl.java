package com.customerapp.service;

import java.util.List;

import com.customerapp.model.Customer;
import com.customerapp.repository.CustomerRepo;
import com.customerapp.repository.CustomerRepoImpl;

public class CustomerServiceImpl implements CustomerService {

	CustomerRepo cust = new CustomerRepoImpl();

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
