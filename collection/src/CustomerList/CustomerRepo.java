package CustomerList;

import java.util.ArrayList;
import java.util.List;

public class CustomerRepo {

	List<Customer> customer = new ArrayList<>();

	// create method to add new customer

	public void addCustomer(Customer c) {
		customer.add(c);
	}

	// get list of customers
	public List<Customer> getAllCustomers() {
		return customer;
	}

	// get customer by name
	public Customer getCustomerByName(String name) {
		Customer data = null;
		for (Customer c : customer) {
			if (c.getName().equalsIgnoreCase(name)) {
				data = c;
			}
		}
		return data;
	}
	
	//find customer by id
	public Customer findCustomerById(int id) {
		for (Customer c : customer) {
			if(c.getId() == id) {
				return c;
			}
		}
		return null;
	}

	// delete customer
	public void deleteCustomerById(int id) {
//		int index = 0;
//		for (Customer c : customer) {
//			if (c.getId() == id) {
//				index = customer.indexOf(c);
//			}
//
//		}
		
		Customer c = findCustomerById(id);
		if(c == null) {
			throw new CustomerNotFoundException("Customer with the given id is not found");
		}
		customer.remove(c);

	}

}
