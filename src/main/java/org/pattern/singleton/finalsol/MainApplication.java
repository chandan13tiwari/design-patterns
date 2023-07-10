package org.pattern.singleton.finalsol;

public class MainApplication {
    public static void main(String[] args) {

        Employee employee = Employee.getInstance();
        Employee newEmployee = Employee.getInstance();

        System.out.println("employee: " + employee);
        System.out.println("newEmployee: " + newEmployee);
    }
}
