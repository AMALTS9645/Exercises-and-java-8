package com.practiceset2.tablebooking;

import java.util.Date;

public class Customer {
	private long id;
	private String name;
	private String MobileNumber;
	private Date birthdate;
	private double averageSpentAmount;
	private double totalAmount;
	private Date dateEnrolled;
	private double rating;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public Date getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(Date birthdate) {
		this.birthdate = birthdate;
	}

	public double getAverageSpentAmount() {
		return averageSpentAmount;
	}

	public void setAverageSpentAmount(double averageSpentAmount) {
		this.averageSpentAmount = averageSpentAmount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public Date getDateEnrolled() {
		return dateEnrolled;
	}

	public void setDateEnrolled(Date dateEnrolled) {
		this.dateEnrolled = dateEnrolled;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public Customer() {
		super();
	}

	public Customer(long id, String name, String mobileNumber, Date birthdate, double averageSpentAmount,
			double totalAmount, Date dateEnrolled, double rating) {
		super();
		this.id = id;
		this.name = name;
		this.MobileNumber = mobileNumber;
		this.birthdate = birthdate;
		this.averageSpentAmount = averageSpentAmount;
		this.totalAmount = totalAmount;
		this.dateEnrolled = dateEnrolled;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "id: " + id + ",\n name: " + name + ",\n MobileNumber: " + MobileNumber + ",\n birthdate: " + birthdate
				+ ",\n averageSpentAmount: " + averageSpentAmount + ",\n totalAmount: " + totalAmount
				+ ",\n dateEnrolled: " + dateEnrolled + ",\n rating: " + rating + "\n";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((MobileNumber == null) ? 0 : MobileNumber.hashCode());
		result = prime * result + ((birthdate == null) ? 0 : birthdate.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Customer other = (Customer) obj;
		if (MobileNumber == null) {
			if (other.MobileNumber != null)
				return false;
		} else if (!MobileNumber.equals(other.MobileNumber))
			return false;
		if (birthdate == null) {
			if (other.birthdate != null)
				return false;
		} else if (!birthdate.equals(other.birthdate))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

}
