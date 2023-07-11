package org.pattern.singleton.threadsafe.earlyinitialization;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApplication{
    public static void main(String[] args) {

        Employee employee = Employee.getInstance();
        Employee newEmployee = Employee.getInstance();

        ExecutorService executorService = Executors.newFixedThreadPool(2);



        System.out.println("employee: " + employee);
        System.out.println("newEmployee: " + newEmployee);
    }
}
