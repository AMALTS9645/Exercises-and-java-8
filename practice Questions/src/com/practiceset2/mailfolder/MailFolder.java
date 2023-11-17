package com.practiceset2.mailfolder;

import java.util.Iterator;
import java.util.List;

public class MailFolder {
	private static String name;
	private static List<Mail> mailList;

	public MailFolder() {
		super();
	}

	public MailFolder(String name, List<Mail> mailList) {
		super();
		this.name = name;
		this.mailList = mailList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Mail> getMailList() {
		return mailList;
	}

	public void setMailList(List<Mail> mailList) {
		this.mailList = mailList;
	}

	public static void addMailToFolder(Mail mail) {
		mailList.add(mail);
	}

	public static boolean removeMailFromFolder(Long id) {
		boolean isDeleted = false;
		Iterator<Mail> it = mailList.iterator();

		while (it.hasNext()) {
			Mail m = (Mail) it.next();
			if (m.getId() == id) {
				it.remove();
				isDeleted = true;
			}
		}

		return isDeleted;
	}

	public static void displayMails() {
		if (mailList.isEmpty()) {
			System.out.println("No mails to show");
		} else {
			System.out.println("Mails in " + name + " is: ");
			System.out.println(String.format("%-10s%-15s%-15s%-15s%-20s%-15s%-10s", "Id", "From", "To", "Subject",
					"Content", "ReceivedDate", "Size\n"));
			for (Mail m : mailList) {
				System.out.println(m);
			}
		}
	}

}
