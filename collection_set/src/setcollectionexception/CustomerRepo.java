package setcollectionexception;

import java.util.HashSet;
import java.util.Set;

public class CustomerRepo {

	Set<Customer> customer = new HashSet<>();

	// create method to add new customer

	public void addCustomer(Customer c) {

		if (customer.contains(c)) {
			throw new CustomerAlreadyExistsException("customer with given id "+c.getId()+" already exists");
		} else {
			customer.add(c);
		}

	}

	// get list of customers
	public Set<Customer> getAllCustomers() {
		return customer;
	}

}
