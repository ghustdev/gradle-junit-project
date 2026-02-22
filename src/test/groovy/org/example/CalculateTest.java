package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculateTest {
	@Test
	void calculateSum() {
		int soma = 2 + 2;
		assertEquals(4, soma, "2 + 2 deveria ser 4");
	}
}