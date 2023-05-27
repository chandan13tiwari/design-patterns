package org.pattern.decorator.secondsol.beverage;

public abstract class Beverage {

    public String description;

    public boolean milk;
    public boolean mocha;
    public boolean whip;
    public boolean soy;

    public String getDescription() {
        return description;
    }

    public int cost() {
        int totalAmt = 0;

        if(hasMilk()) {
            totalAmt = totalAmt + 10;
        }

        if(hasMocha()) {
            totalAmt = totalAmt + 20;
        }

        if(hasSoy()) {
            totalAmt = totalAmt + 30;
        }

        if(hasWhip()) {
            totalAmt = totalAmt + 50;
        }

        return totalAmt;
    }

    public void setMilk(boolean milk) {
        this.milk = milk;
    }

    public void setMocha(boolean mocha) {
        this.mocha = mocha;
    }

    public void setWhip(boolean whip) {
        this.whip = whip;
    }

    public void setSoy(boolean soy) {
        this.soy = soy;
    }

    public boolean hasMilk() {
        return this.milk;
    }

    public boolean hasSoy() {
        return this.soy;
    }

    public boolean hasMocha() {
        return this.mocha;
    }

    public boolean hasWhip() {
        return this.whip;
    }
}
