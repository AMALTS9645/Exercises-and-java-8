package com.customerapp.repository;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.customerapp.exception.CustomerAlreadyExistsException;
import com.customerapp.exception.CustomerNotFoundException;
import com.customerapp.model.Customer;

class CustomerRepoImplTest {

	CustomerRepoImpl repo;

	@BeforeEach
	public void init() {
		repo = new CustomerRepoImpl();
	}

	@Test
	void testAddCustomer() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		repo.addCustomer(c);
		assertEquals(c, repo.getCustomerById(101));

		assertThrows(CustomerAlreadyExistsException.class, () -> repo.addCustomer(c));
	}

	@Test
	void testGetCustomerById() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		repo.addCustomer(c);
		assertNotNull(repo.getCustomerById(101));

		assertThrows(CustomerNotFoundException.class, () -> repo.getCustomerById(108));

	}

	@Test
	void testGetCustomerByName() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		repo.addCustomer(c);
		assertNotNull(repo.getCustomerByName("amal"));

		assertThrows(CustomerNotFoundException.class, () -> repo.getCustomerByName("akhil"));
	}

	@Test
	void testDeleteCustomer() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		repo.addCustomer(c);
		repo.deleteCustomer(101);

		assertThrows(CustomerNotFoundException.class, () -> repo.getCustomerById(101));
	}

	@Test
	void testGetAllCustomers() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		Customer c1 = new Customer(102, "anson", "anson@gmail.com");

		repo.addCustomer(c);
		repo.addCustomer(c1);

		assertTrue(repo.getAllCustomers().size() == 2);
	}

}
