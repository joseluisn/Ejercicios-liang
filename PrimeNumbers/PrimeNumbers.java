/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.PrimeNumbers;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class PrimeNumbers {

    public static void main(String[] args) {
        Stack stack = new Stack();
      //  stack.push(1);
        int cont = 0;
        for (int i = 1; i < 120; i++) {
            for (int j = 1; j < 120; j++) {
                if (i % j == 0) {
                    cont++;
                }
            }

            if (cont == 2) {
                stack.push(i);

            }
            cont=0;
        }
        

        while (!stack.empty()) {
            System.out.print(stack.pop() + " ");
        }

        System.out.println();
    }

}
