package org.pattern.state.secondsol.state;

import org.pattern.state.secondsol.ATMMachine;

public class CashWithdrawlState implements State{

    ATMMachine atmMachine;

    public CashWithdrawlState(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please wait!! Transaction processing..");
    }

    @Override
    public void ejectCard() {
        System.out.println("Please wait!! We are processing your transaction..");
    }

    @Override
    public void enterWithdrawAmount(int amount) {
        System.out.println("Input rejected!! Transaction is already processing..");
    }

    @Override
    public void collectCash(int amount) {
        atmMachine.releaseCash(amount);
        if (atmMachine.getCash() > 0) {
            System.out.println("Please collect your cash and card...");
            atmMachine.setState(atmMachine.getNoCardState());
        } else {
            System.out.println("Sorry!! Out of Cash..");
            atmMachine.setCash(0);
            atmMachine.setState(atmMachine.getOutOfCashState());
        }
    }
}
