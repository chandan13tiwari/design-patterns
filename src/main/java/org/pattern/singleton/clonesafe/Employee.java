package org.pattern.singleton.clonesafe;

import java.io.Serial;
import java.io.Serializable;

public class Employee implements Cloneable {
    public static Employee employee = new Employee();

    private Employee() { }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        //super.clone();
        //throw new CloneNotSupportedException();
        return employee;
    }
}
