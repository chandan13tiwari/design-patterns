package org.pattern.state.secondsol.state;

import org.pattern.state.secondsol.ATMMachine;

public class OutOfCashState implements State{

    ATMMachine atmMachine;

    public OutOfCashState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't insert the card!! Machine is out of cash..");
    }

    @Override
    public void ejectCard() {
        System.out.println("You can't eject the card!! You haven't inserted a card yet..");
    }

    @Override
    public void enterWithdrawAmount(int amount) {
        System.out.println("No CASH!! Please check again tomorrow..");
    }

    @Override
    public void collectCash(int amount) {
        System.out.println("Can't withdraw cash..");
    }
}
