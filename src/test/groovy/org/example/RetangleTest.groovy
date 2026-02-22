package org.example

import org.junit.jupiter.api.Test
import static org.junit.jupiter.api.Assertions.*;

class RetangleTest {
    def ret

    @Test
    void calculateAreaTest() {
        ret = new Retangle(base: 10, high: 20)
        def result = ret.getArea()
        assertEquals(200.0, result, "10 * 20 deve ser 200")
    }
}
