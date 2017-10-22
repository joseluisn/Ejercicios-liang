/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class CheckingAccount extends Account {

    protected double OVERDRAFT_LIMIT = -100;

    public CheckingAccount(int id, double balance) {
        super(id, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= OVERDRAFT_LIMIT) {
            super.withdraw(amount);
        }
    }

    @Override
    public String toString() {
        return "CheckingAccount " + "Balance= " + balance;
    }

}
