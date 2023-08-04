package org.pattern.command.secondsol.appliances;

public class BedroomLight implements Light {
    @Override
    public void on() {
        System.out.println("Bedroom Light is ON");
    }

    @Override
    public void off() {
        System.out.println("Bedroom Light is OFF");
    }
}
