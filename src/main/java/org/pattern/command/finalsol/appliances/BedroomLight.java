package org.pattern.command.finalsol.appliances;

public class BedroomLight implements Light {
    String location;

    public BedroomLight(String location) {
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
