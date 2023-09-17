package org.pattern.state.secondsol;

public class XYZBankApplication {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(1000);

        System.out.println(atmMachine);

        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(100);

        System.out.println(atmMachine);

        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(100);
        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(200);

        System.out.println(atmMachine);
    }
}
