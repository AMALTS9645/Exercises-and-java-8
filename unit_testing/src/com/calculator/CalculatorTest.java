package com.calculator;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

	

public class CalculatorTest {
	
	Calculator calc ;

	
	@BeforeEach
	public void init() {
		calc = new Calculator();
		System.out.println("test started");
	}
	
	@AfterEach
	public void tearDown() {
		System.out.println("Test completed");
		calc = null;
	}
	
	@Test
	public void testAdd() {

		int result = calc.add(10, 30);
		assertEquals(40, result);
	}

	@Test
	public void testLargest() {

		assertEquals(15, calc.findLargest(10, 15));
		assertEquals(-10, calc.findLargest(-10, -15));
		assertEquals(157, calc.findLargest(100, 157));
	}

	@Test
	public void testDivide() {
		assertEquals(5, calc.divide(10, 2));
		assertEquals(2, calc.divide(10, 5));
		assertEquals(75, calc.divide(150, 2));
		assertThrows(ArithmeticException.class, () -> calc.divide(10, 0));

	}
}
