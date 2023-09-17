package org.pattern.state.finalsol.state;

import org.pattern.state.finalsol.ATMMachine;

public class NoCardState implements State{

    ATMMachine atmMachine;

    public NoCardState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("You have inserted the card..");
        atmMachine.setState(atmMachine.getHasCardState());
    }

    @Override
    public void ejectCard() {
        System.out.println("You haven't inserted the card!!");
    }

    @Override
    public void enterWithdrawAmount(int amount) {
        System.out.println("Sorry. Can't Withdraw the cash!! There is no card inserted..");
    }

    @Override
    public void collectCash(int amount) {
        System.out.println("You need to insert the card first..");
    }
}
