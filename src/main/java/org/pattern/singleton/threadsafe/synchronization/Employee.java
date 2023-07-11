package org.pattern.singleton.threadsafe.synchronization;

public class Employee {
    private static Employee employee;

    private Employee() {

    }

    public static synchronized Employee getInstance() {
        if(employee == null) {
            employee = new Employee();
        }

        return employee;
    }
}
