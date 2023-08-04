package org.pattern.command.thirdsol.appliances;

public class KitchenLight implements Light {
    String location;

    public KitchenLight(String location) {
        this.location = location;
    }
    @Override
    public void on() {
        System.out.println(this.location + " Light is ON");
    }

    @Override
    public void off() {
        System.out.println(this.location + " Light is OFF");
    }
}
