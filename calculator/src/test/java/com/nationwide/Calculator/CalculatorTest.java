package com.nationwide.Calculator;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalculatorTest {
	@Test
	public void multiplicationTest() {
		Calculator calc = new Calculator();
		//calc.multiply(2,4) == 8;
		assertEquals("Mutltiply failed", 8, calc.multiply(2, 4));
	}
	@Test
	public void addTest() {
		Calculator calc = new Calculator();
		//calc.add(2,4) == 8;
		assertEquals("Add failed", 15, calc.add(7, 8));
	}

}