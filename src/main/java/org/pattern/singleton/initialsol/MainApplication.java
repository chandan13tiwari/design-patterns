package org.pattern.singleton.initialsol;

public class MainApplication {
    public static void main(String[] args) {
        Employee employee = new Employee();
        Employee newEmployee = new Employee();

        System.out.println("employee: " + employee);
        System.out.println("newEmployee: " + newEmployee);
    }
}
