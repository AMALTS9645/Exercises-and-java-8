package collection_set;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CustomerRepo {

	Set<Customer> customer = new HashSet<Customer>();

	// create method to add new customer

	public void addCustomer(Customer c) {
		customer.add(c);
	}

	// get list of customers
	public Set<Customer> getAllCustomers() {
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
		customer.remove(c);

	}

}

