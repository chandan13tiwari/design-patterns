package org.pattern.state.secondsol.state;

import org.pattern.state.secondsol.ATMMachine;

public class HasCardState implements State{

    ATMMachine atmMachine;

    public HasCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You can't insert another card!!");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card removed!!");
        atmMachine.setState(atmMachine.getNoCardState());
    }

    @Override
    public void enterWithdrawAmount(int amount) {
        System.out.println("PIN matched!! Transaction is in progress");
        atmMachine.setState(atmMachine.getCashWithdrawlState());

        atmMachine.getState().collectCash(amount);
    }

    @Override
    public void collectCash(int amount) {
        System.out.println("You need to enter the PIN and amount first..");
    }
}
