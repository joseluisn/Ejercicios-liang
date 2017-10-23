/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Exercises11 {

    /**
     * Main method
     */
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        ArrayList<Integer> listinteger = new ArrayList<Integer>(); 
        System.out.println("How many elements will you enter");
        int op = in.nextInt();

        System.out.println("Enter the number " + op + " ");
        for (int i = 0; i < op; i++) {
            listinteger.add(in.nextInt());
        }
        System.out.println("Unordered List");
        System.out.println(listinteger.toString());
        sort(listinteger);
        System.out.println("Ordered List");
        System.out.println(listinteger.toString());
    }

    public static void sort(ArrayList<Integer> list) {
        java.util.Collections.sort(list);
    }

}
