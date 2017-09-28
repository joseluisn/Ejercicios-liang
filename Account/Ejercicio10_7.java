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
public class Ejercicio10_7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();
        Account[] accounts = new Account[10];
        for (int i = 0; i < 10; i++) {
            accounts[i] = new Account(i, 100.0);
        }

        System.out.print("Enter an id (0 - 9): ");
        int id = input.nextInt();

       if(menu.idValidation(id, accounts) == true) {
            menu.menuDisplay(id, accounts);
        }

    }

}
