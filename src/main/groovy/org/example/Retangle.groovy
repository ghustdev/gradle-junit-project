package org.example

import groovy.transform.CompileStatic
import groovy.transform.ToString

@CompileStatic
@ToString
class Retangle {
    private double base
    private double high

    double getArea() {
        base * high
    }
}
