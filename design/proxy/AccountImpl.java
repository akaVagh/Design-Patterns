/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package design.proxy;

/**
 *
 * @author harsh vaghani
 */
public class AccountImpl implements Account {

    double customerBalance;
    String customerName;

    public AccountImpl(String custName, double balance) {
        this.customerName = custName;
        this.customerBalance = balance;

    }

    @Override
    public String withdraw(double amount) {
        String status;
        if (amount <= 0) {
            status = "Error: Negative Balance";
        } else if ((this.customerBalance - amount) < 500.0) {
            status
                    = "Error: Insufficient Balance. Min. Rs. 500 needed in your account.";
        } else {
            this.customerBalance -= amount;
            status = "Withdrawal Succefful, Updated balance =" + this.customerBalance;
        }
        return status;
    }

    @Override
    public String deposit(double amount) {
        String status;
        if (amount <= 0) {
            status = "Error: Negative Balance";
        } else {
            this.customerBalance += amount;
            status = "Deposit Succefful, Updated balance=" + this.customerBalance;
        }
        return status;
    }
}
