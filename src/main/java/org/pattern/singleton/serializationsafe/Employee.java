package org.pattern.singleton.serializationsafe;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Serializable {
    private static Employee employee = new Employee();

    private Employee() { }

    @Serial
    protected Object readResolve() {
        return employee;
    }
}
