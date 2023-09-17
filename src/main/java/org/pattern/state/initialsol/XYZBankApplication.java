package org.pattern.state.initialsol;

public class XYZBankApplication {
    public static void main(String[] args) {
        ATMMachine atmMachine = new ATMMachine(1000);

        System.out.println(atmMachine);

        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(100);

        System.out.println(atmMachine);

        atmMachine.insertCard();
        atmMachine.ejectCard();
        atmMachine.enterWithdrawAmount(100);

        System.out.println(atmMachine);

        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(200);
        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(100);
        atmMachine.ejectCard();

        System.out.println(atmMachine);

        atmMachine.refillMachineWithCash(500);

        atmMachine.insertCard();
        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(1000);
        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(100);

        System.out.println(atmMachine);

        atmMachine.insertCard();
        atmMachine.enterWithdrawAmount(100);

        System.out.println(atmMachine);
    }
}
