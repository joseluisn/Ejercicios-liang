/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Account;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_7 {

    public static void main(String[] args) {
        Account acc = new Account(1122, 20000);
        acc.setAnnualInterestRate(4.5);
        acc.withdraw(25000);
        acc.deposit(3000);
        System.out.println("Balance= $" + acc.getBalance());
        System.out.println("Monthly Interest= " + acc.getMonthlyInterest());
        System.out.println("Date Created= " + acc.getDateCreated());
    }

}
