package org.pattern.command.thirdsol.appliances;

public class KitchenLight implements Light {
    @Override
    public void on() {
        System.out.println("Kitchen Light is ON");
    }

    @Override
    public void off() {
        System.out.println("Kitchen Light is OFF");
    }
}
