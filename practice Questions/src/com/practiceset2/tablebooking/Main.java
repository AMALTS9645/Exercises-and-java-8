package com.practiceset2.tablebooking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		List<Customer> customerList = new ArrayList<>();

		for (int i = 0; i < 2; i++) {
			System.out.println("Enter the details of customer " + (i + 1) + ":");
			String allDet = scan.next() + scan.nextLine();
			String[] details = allDet.split(",");
			Customer cust = null;
			try {
				cust = new Customer(Long.parseLong(details[0]), details[1], details[2], sdf.parse(details[3]),
						Double.parseDouble(details[4]), Double.parseDouble(details[5]), sdf.parse(details[6]),
						Double.parseDouble(details[7]));
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			customerList.add(cust);

		}

		int count = 1;
		for (Customer c : customerList) {
			System.out.println("The customer " + (count++) + " is : ");
			System.out.println(c);
		}

		if (customerList.get(0).equals(customerList.get(1))) {
			System.out.println("Both customers are same");
		} else {
			System.out.println("Both customers are different");
		}

	}

}
