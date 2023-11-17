package com.uml;

import java.util.ArrayList;
import java.util.List;

public class Bank {
	public String code;
	public String address;
	public String maintains;
	List<Atm> listAtm = new ArrayList<>();
	List<Account> listAccount = new ArrayList<>();
	Atm atm = new Atm();
	Account account = new Account();

	public void managers() {

	}
}
