package com.customerapp.repository;

import java.util.ArrayList;
import java.util.List;

import com.customerapp.exception.CustomerAlreadyExistsException;
import com.customerapp.exception.CustomerNotFoundException;
import com.customerapp.model.Customer;

public class CustomerRepoImpl implements CustomerRepo {
	List<Customer> customers = new ArrayList<>();

	@Override
	public Customer addCustomer(Customer c) {
		Customer customer = null;

		for (Customer cust : customers) {
			if (c.getId() == cust.getId()) {
				customer = cust;
				break;
			}
		}

		if (customer != null) {
			throw new CustomerAlreadyExistsException("Customer already exists add another");

		} else {
			customers.add(c);
		}

		return customer;
	}

	@Override
	public Customer getCustomerById(int id) {
		Customer customer = null;
		for (Customer c : customers) {
			if (c.getId() == id) {
				customer = c;
			}
		}

		if (customer == null) {
			throw new CustomerNotFoundException("Customer with given id not found");
		}
		return customer;
	}

	@Override
	public Customer getCustomerByName(String name) {
		Customer customer = null;
		for (Customer c : customers) {
			if (c.getName().equalsIgnoreCase(name)) {
				return c;
			}
		}
		if (customer == null) {
			throw new CustomerNotFoundException("Customer with given name not found");
		}
		return customer;
	}

	@Override
	public void deleteCustomer(int id) {
		boolean isExist = false;
		Customer customer = null;
		for (Customer c : customers) {
			if (c.getId() == id) {
				isExist = true;
				customer = c;
			}
		}
		if (isExist == false) {
			throw new CustomerNotFoundException("Customer with given id not exist");
		} else {
			customers.remove(customer);
		}

	}

	@Override
	public List<Customer> getAllCustomers() {
		// TODO Auto-generated method stub
		return customers;
	}

}
