package com.customerapp.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.customerapp.exception.CustomerAlreadyExistsException;
import com.customerapp.exception.CustomerNotFoundException;
import com.customerapp.model.Customer;

class CustomerServiceImplTest {

	CustomerServiceImpl service;

	@BeforeEach
	public void init() {
		service = new CustomerServiceImpl();
	}

	@Test
	void testAddCustomer() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		service.addCustomer(c);
		assertEquals(c, service.getCustomerById(101));

		assertThrows(CustomerAlreadyExistsException.class, () -> service.addCustomer(c));

	}

	@Test
	void testGetCustomerById() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerById(101));

		assertThrows(CustomerNotFoundException.class, () -> service.getCustomerById(108));

	}

	@Test
	void testGetCustomerByName() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		service.addCustomer(c);
		assertNotNull(service.getCustomerByName("amal"));

		assertThrows(CustomerNotFoundException.class, () -> service.getCustomerByName("akhil"));
	}

	@Test
	void testDeleteCustomer() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		service.addCustomer(c);
		service.deleteCustomer(101);

		assertThrows(CustomerNotFoundException.class, () -> service.getCustomerById(101));
	}

	@Test
	void testGetAllCustomers() {
		Customer c = new Customer(101, "amal", "amal@gmail.com");
		Customer c1 = new Customer(102, "anson", "anson@gmail.com");

		service.addCustomer(c);
		service.addCustomer(c1);

		assertTrue(service.getAllCustomers().size() == 2);

//		assertArrayEquals(customers,service.getAllCustomers());
	}

}
