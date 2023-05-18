package com.Testing;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
	private Calculator calculator = new Calculator();

	@Test
	public void testAddition() {
		int actualResult = calculator.add(6, 3);
		int expectedResult = 9;

		Assertions.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testSubtraction() {
		int actualResult = calculator.subtract(16, 10);
		int expectedResult = 6;

		Assertions.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testMultiplication() {
		int actualResult = calculator.multiply(5, 3);
		int expectedResult = 15;

		Assertions.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void testDivision() {
		double actualResult = calculator.divide(12, 4);
		double expectedResult = 3;

		Assertions.assertEquals(actualResult, expectedResult);
	}

	@Test
	public void isNotNull() {
		Assertions.assertNotNull(calculator); // pass
	}

	@Test
	public void isNull() {
		Assertions.assertNull(calculator); // fails
	}

}
