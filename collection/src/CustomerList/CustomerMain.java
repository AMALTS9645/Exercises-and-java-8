package CustomerList;

import java.util.List;

public class CustomerMain {

	public static void main(String[] args) {
		CustomerRepo cust = new CustomerRepo();
		// create a customer object
		Customer c1 = new Customer(101, "amal", "amal@gmail.com");
		Customer c2 = new Customer(102, "anson", "anson@gmail.com");
		Customer c3 = new Customer(103, "rohit", "rohit@gmail.com");
		Customer c4 = new Customer(104, "amalSCS", "amalSCS@gmail.com");

		cust.addCustomer(c1);
		cust.addCustomer(c2);
		cust.addCustomer(c3);
		cust.addCustomer(c4);

		List<Customer> customerDetails = cust.getAllCustomers();

//		System.out.println(customerDetails);

		for (Customer c : customerDetails) {
			System.out.println(c);
		}

		Customer det = cust.getCustomerByName("amal");

		System.out.println("The customer details is: " + det);

		try {

			cust.deleteCustomerById(108);
			System.err.println("The customer list after deleting element is:  ");
			for (Customer c : customerDetails) {
				System.out.println(c);
			}

		} catch (Exception e) {
			System.err.println(e.getMessage());
		}

	}

}
