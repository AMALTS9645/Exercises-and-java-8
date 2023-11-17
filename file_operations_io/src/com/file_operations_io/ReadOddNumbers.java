package com.file_operations_io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ReadOddNumbers {

	public static void main(String[] args) {
		FileReader reader = null;
		Scanner scan = null;
		try {

			reader = new FileReader("numbers.txt");
			scan = new Scanner(reader);

			while (scan.hasNext()) {
				int num = scan.nextInt();
				if (num % 2 != 0) {
					System.out.println(num);
				}
			}

		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} finally {
			try {
				reader.close();
				scan.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
	}
}
