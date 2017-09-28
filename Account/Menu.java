/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.Account;

import java.util.Scanner;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Menu {

    Scanner input = new Scanner(System.in);
    Account[] accounts = new Account[10];
    

    public  boolean idValidation(int id, Account[] accounts) {

        if (id >= 0 && id < 10) {
            return true;
        } else {
            System.out.println("Id entered incorrect");
           return false;
        }

    }

    public  void menuDisplay(int id,Account[] accounts) {

        System.out.println("Main menu");
        System.out.println("------------------");
        System.out.println("1: check balance");
        System.out.println("2: withdraw");
        System.out.println("3: deposit");
        System.out.println("4: exit");
        int option = input.nextInt();
        performChoice(id, option, accounts);

    }

    public  void performChoice(int id, int choice, Account[] accounts) {
        Scanner op = new Scanner(System.in);
        switch (choice) {
            case 1:
                System.out.printf("The balance is $%.1f%n",
                        accounts[id].getBalance());
                menuDisplay(id,accounts);
                break;
            case 2:
                System.out.print("Enter the amount to withdraw: ");
                accounts[id].withdraw(op.nextDouble());
                menuDisplay(id,accounts);
                break;
            case 3:
                System.out.print("Enter the amount to deposit: ");
                accounts[id].deposit(op.nextDouble());
                menuDisplay(id,accounts);
                break;
            default:
                break;
        }
    }
}

