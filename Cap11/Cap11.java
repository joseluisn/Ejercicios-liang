/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

import java.util.Scanner;
import cap11.Triangle;
import cap11.GeometricObject;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Cap11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Account account = new Account(111, 500);
        CheckingAccount checkingAccount = new CheckingAccount(112, 550);
        SavingsAccount savingsAccount = new SavingsAccount(113, 600);

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingsAccount);

    }

}
