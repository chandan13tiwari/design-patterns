package org.pattern.singleton.threadsafe.doublecheck;

public class Employee {
    private volatile static Employee employee;

    private Employee() { }

    public static Employee getInstance() {
        if(employee == null) {
            synchronized (Employee.class) {
                if(employee == null) {
                    employee = new Employee();
                }
            }
        }

        return employee;
    }
}
