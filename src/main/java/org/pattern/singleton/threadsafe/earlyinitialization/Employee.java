package org.pattern.singleton.threadsafe.earlyinitialization;

public class Employee {
    private static Employee employee = new Employee();

    private Employee() { }

    public static Employee getInstance() {
        return employee;
    }
}
