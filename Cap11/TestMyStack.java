/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

import java.util.Scanner;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class TestMyStack {

    public static void main(String[] args) {
        MyStack stack = new MyStack();
        Scanner input = new Scanner(System.in);
        System.out.println("How many elements will you enter");
        int op = input.nextInt();

        System.out.println("Enter the data " + op + " ");
        for (int i = 0; i < op; i++) {
            stack.push(input.next());
        }

        System.out.println("Displaying them in reverse order.");
        System.out.print("{");
        while (stack.size() > 0) {
            System.out.print(stack.pop());
            System.out.print(",");
        }
        System.out.print("}");

    }
}
