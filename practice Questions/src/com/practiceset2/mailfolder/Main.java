package com.practiceset2.mailfolder;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter name of the folder: ");
		String name = scan.next() + scan.nextLine();
		List<Mail> mails = new ArrayList<>();

		MailFolder mailfolder = new MailFolder(name, mails);

		while (true) {
			System.out.println("1.Add Mail\n2.Delete Mail\n3.Display Mails\n4.Exit");
			int choise = scan.nextInt();

			switch (choise) {
			case 1:
				System.out.println("Enter the details of mail in CSV format:");
				String s = scan.next() + scan.nextLine();
				Mail m = Mail.createMail(s);
				MailFolder.addMailToFolder(m);
				System.out.println("Mail successfully added");
				break;
			case 2:
				System.out.println("Enter the id of the mail to be deleted:");
				Long id = scan.nextLong();
				boolean isDeleted = MailFolder.removeMailFromFolder(id);
				if (isDeleted) {
					System.out.println("Mail successfully deleted");
				} else {
					System.out.println("Mail not found in the folder");
				}
				break;
			case 3:
				MailFolder.displayMails();
				break;
			case 4:
				System.out.println("Exited");
				System.exit(0);
			default:
				System.out.println("Entered wrong choise");
				break;

			}
		}

	}

}
