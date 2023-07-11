package org.pattern.singleton.clonesafe;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MainApplication{
    public static void main(String[] args) throws CloneNotSupportedException {

        Employee instance1 = Employee.employee;
        Employee instance2 = (Employee) instance1.clone();
        System.out.println("instance1 hashCode:- "
                + instance1.hashCode());
        System.out.println("instance2 hashCode:- "
                + instance2.hashCode());
    }
}
