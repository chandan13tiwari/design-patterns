package org.pattern.state.secondsol;

import org.pattern.state.secondsol.state.*;

public class ATMMachine {
    State noCardState;
    State hasCardState;
    State cashWithdrawlState;
    State outOfCashState;

    State state;
    int cash = 0;

    public ATMMachine(int cash) {
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        cashWithdrawlState = new CashWithdrawlState(this);
        outOfCashState = new OutOfCashState(this);

        state = outOfCashState;

        this.cash = cash;
        if(cash > 0) {
            state = noCardState;
        }
    }

    public void insertCard() {
        state.insertCard();
    }
    public void ejectCard() {
        state.ejectCard();
    }
    public void enterWithdrawAmount(int amount) {
        state.enterWithdrawAmount(amount);
    }
    public void setState(State state) {
        this.state = state;
    }

    public void releaseCash(int amount) {
        if (this.cash > 0) {
            this.cash = this.cash - amount;
        }
    }

    public State getNoCardState() {
        return noCardState;
    }

    public State getHasCardState() {
        return hasCardState;
    }

    public State getCashWithdrawlState() {
        return cashWithdrawlState;
    }

    public State getOutOfCashState() {
        return outOfCashState;
    }

    public int getCash() {
        return cash;
    }

    public State getState() {
        return state;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    @Override
    public String toString() {
        return "ATMMachine{" +
                "state=" + state +
                ", cash=" + cash +
                '}';
    }
}
