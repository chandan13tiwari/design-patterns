package org.pattern.state.finalsol.state;

public interface State {

    void insertCard();

    void ejectCard();

    void enterWithdrawAmount(int amount);

    void collectCash(int amount);
}
