package org.pattern.observer.initialsol.displays;

public class CurrentConditionDisplay {

    public void update(float temp, float humidity, float pressure){
        System.out.println("~~~~ CURRENT CONDITIONS DISPLAY ~~~~");
        System.out.println("Temperature is: " + temp);
        System.out.println("Humidity is: " + humidity);
        //System.out.println("Pressure is: " + pressure);
    }
}
