package com.file_operations_io;

import java.io.FileNotFoundException;

import java.io.FileReader;

import java.io.FileWriter;

import java.io.IOException;

import java.util.Scanner;

public class ReadAndWriteOddOrEven {

	public static void main(String[] args) {

		FileReader reader = null;

		FileWriter evenWriter = null, oddWriter = null;

		Scanner sc = null;

		try {

			reader = new FileReader("numbers.txt");

			evenWriter = new FileWriter("even.txt", true);

			oddWriter = new FileWriter("odd.txt", true);

			sc = new Scanner(reader);

			while (sc.hasNext()) {

				int num = sc.nextInt();

				if (num % 2 == 0) {

					try {

						evenWriter.write(num + " ");

					} catch (IOException e) {

						e.printStackTrace();
					}

				} else {

					try {

						oddWriter.write(num + " ");

					} catch (IOException e) {
						e.printStackTrace();

					}

				}

			}

		} catch (IOException e1) {
			e1.printStackTrace();

		} finally {

			try {
				evenWriter.close();
				oddWriter.close();
				reader.close();
				sc.close();
			} catch (IOException e2) {
				e2.printStackTrace();
			}
		}
	}

}