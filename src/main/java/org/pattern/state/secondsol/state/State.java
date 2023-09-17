package org.pattern.state.secondsol.state;

public interface State {

    void insertCard();

    void ejectCard();

    void enterWithdrawAmount(int amount);

    void collectCash(int amount);
}
