package com.java8.defaultstatic;

interface Printable {
	// all methods are public abstract
	void print();

	default void scan() {
		System.out.println("default scanning...");
	}

	static void show() {
		System.out.println("Hello world");
	}
}

class Printer implements Printable {

	public void print() {
		System.out.println("im printing...");

	}

	public void scan() {
		System.out.println("im scanning...");

	}

}

public class DefaultAndStatic {
	public static void main(String[] args) {
		Printer printer = new Printer();
		printer.print();

		printer.scan();
		Printable.show();
	}
}
