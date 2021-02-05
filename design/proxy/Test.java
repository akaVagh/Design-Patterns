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
public class Test {

    public static void main(String[] args) {
        Account myAcc = new AccountProxy("Harsh", 92000.0);
        System.out.println("Deposit Rs. 3,00,000");
        System.out.println("Transaction Status: " + myAcc.deposit(300000));
        System.out.println("Widthdraw Rs. 10,300");
        System.out.println("Transaction Status: " + myAcc.withdraw(10300));
    }
}
