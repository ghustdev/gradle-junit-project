package org.example;

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*

class CalculateTest {
	@Test
	void sumTest() {
		def calc = new Calculate()

		assertEquals(30, calc.sum(10, 20), "2 + 2 deveria ser 4")
	}
	
	// melhor que usar try catch
	// @Test(expected = ArithmeticException.class)
	@Test
	void dividTest() {
		try {
			def calc = new Calculate()

			int n1 = 10
			int n2 = 1
			calc.divid(n1, n2)
		}
		catch (ArithmeticException e) {
			println e
		}
	}
}