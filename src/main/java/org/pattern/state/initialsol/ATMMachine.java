package org.pattern.state.initialsol;

public class ATMMachine {
    // defining all the states
    final static int OUT_OF_CASH = 0;
    final static int NO_CARD = 1;
    final static int HAS_CARD = 2;
    final static int CASH_WITHDRAWL = 3;

    int state = OUT_OF_CASH;
    int cash = 0;

    // this constructor will fill the ATM with the cash and check if we have sufficient cash present in the machine.
    public ATMMachine(int cash) {
        this.cash = cash;

        if(cash > 0) {
            state = NO_CARD;
        }
    }

    public void insertCard() {
        if(state == HAS_CARD) {
            System.out.println("You can't insert another card!!");
        } else if(state == NO_CARD) {
            state = HAS_CARD;
            System.out.println("You have inserted the card..");
        } else if (state == OUT_OF_CASH) {
            System.out.println("You can't insert the card!! Machine is out of cash..");
        } else if(state == CASH_WITHDRAWL) {
            System.out.println("Please wait!! Transaction processing..");
        }
    }

    public void ejectCard() {
        if(state == HAS_CARD) {
            System.out.println("Card removed!!");
            state = NO_CARD;
        } else if (state == NO_CARD) {
            System.out.println("You haven't inserted the card!!");
        } else if(state == CASH_WITHDRAWL) {
            System.out.println("Please wait!! We are processing your transaction..");
        } else if(state == OUT_OF_CASH) {
            System.out.println("You can't eject the card!! You haven't inserted a card yet..");
        }
    }

    public void enterWithdrawAmount(int amount) {
        if(state == CASH_WITHDRAWL) {
            System.out.println("Input rejected!! Transaction is already processing..");
        } else if(state == NO_CARD) {
            System.out.println("Can't Withdraw the cash!! There is no card inserted..");
        } else if(state == OUT_OF_CASH) {
            System.out.println("No CASH!! Please check again tomorrow..");
        } else if(state == HAS_CARD) {
            System.out.println("PIN matched!! Transaction is in progress");
            state = CASH_WITHDRAWL;

            collectCash(amount);
        }
    }

    public void collectCash(int amount) {
        if(state == CASH_WITHDRAWL) {
            cash = cash - amount;
            if(cash < 0) {
                System.out.println("Sorry!! Out of Cash..");
                state = OUT_OF_CASH;
                cash = 0;
            } else {
                System.out.println("Please collect your cash and card...");
                state = NO_CARD;
            }
        } else if(state == NO_CARD) {
            System.out.println("You need to insert the card first..");
        } else if(state == OUT_OF_CASH) {
            System.out.println("Can't withdraw cash..");
        } else if(state == HAS_CARD) {
            System.out.println("You need to enter the PIN and amount first..");
        }
    }

    public void refillMachineWithCash(int cash) {
        this.cash = this.cash + cash;
        System.out.println("Machine Refilled with amount: " + cash);
    }

    @Override
    public String toString() {
        return "ATMMachine{" +
                "state=" + state +
                ", cash=" + cash +
                '}';
    }
}
