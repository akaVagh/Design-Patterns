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
public class AccountProxy implements Account {

    private AccountImpl account;

    AccountProxy(String custName, double balance) {
        account = new AccountImpl(custName, balance);
    }

    @Override
    public String withdraw(double amount) {
        return account.withdraw(amount);
    }

    @Override
    public String deposit(double amount) {
        return account.deposit(amount);
    }
}
