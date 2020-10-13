package labsheet5.exercise5;

import javax.swing.*;

public class TestBankAccount {
    public static void main(String[] args) {

        String output = "";

        BankAccount bankAccount1 = new BankAccount();

        output += "Calling the no-argument Bank Account constructor. The first Bank " +
                "account details are:" + bankAccount1.toString();

        BankAccount bankAccount2 = new BankAccount("Richy Rich",0.75);

        output += "\n\nCalling the multi-argument Bank Account constructor. The second Bank " +
                "account details are:" + bankAccount2.toString();

        BankAccount.setInterestRate(0.5);

        output += "\n\nNow calling the setInterestRate() method to change the interest rate to " + BankAccount.getInterestRate();

        output += "\n\nThe first bank account object details are:"+bankAccount1.toString();

        output += "\n\nThe second bank account object details are:"+bankAccount2.toString();



        JOptionPane.showMessageDialog(null,output,"Bank Account Object Data",JOptionPane.INFORMATION_MESSAGE);

        System.exit(0);






    }
}
