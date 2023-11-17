package setcollectionexception;

import java.util.Set;


public class CustomerMain {

	public static void main(String[] args) {
		CustomerRepo cust = new CustomerRepo();
		// create a customer object
		Customer c1 = new Customer(101, "amal", "amal@gmail.com");
		Customer c2 = new Customer(102, "anson", "anson@gmail.com");
		Customer c3 = new Customer(103, "rohit", "rohit@gmail.com");
		Customer c4 = new Customer(104, "amalSCS", "amalSCS@gmail.com");
		Customer c5 = new Customer(104, "amalSCS", "amalSCS@gmail.com");
		
		Set<Customer> customerDetails = cust.getAllCustomers();

		try {
			
			cust.addCustomer(c1);
			cust.addCustomer(c2);
			cust.addCustomer(c3);
			cust.addCustomer(c4);
			cust.addCustomer(c5);

			
			
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
		for (Customer c : customerDetails) {
			System.out.println(c);
		}

	}

}
