package org.example

class Calculate {
    int sum(int n1, int n2) {
        n1 + n2
    }

    int divid(int n1, int n2) {
        if (n2 == 0) {
            throw new ArithmeticException()
        }
        n1 / n2
    }
}
