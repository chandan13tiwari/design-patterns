package org.pattern.adapter.example1.mobile;

public class MobileWithMicroUSB implements Mobile{
    @Override
    public void port() {
        System.out.println("Mobile with Micro USB port");
    }
}
