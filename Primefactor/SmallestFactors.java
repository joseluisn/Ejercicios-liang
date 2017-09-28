/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.Primefactor;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class SmallestFactors {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Stack stack = new Stack();

        System.out.println("Ingrese entero");
        int d = input.nextInt();
        
        int j = 2;
        while (d / j != 1) {

            if (d % j == 0) {
                stack.push(j);
                d/=j;

            } else {
                j++;
            }
        }
        stack.push(d);
        System.out.println("La pila es " + stack);
        
        while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
		System.out.println();

    }

}
