/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.MyInteger;

import java.util.Arrays;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio_103 {

    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(11);
        MyInteger int2 = new MyInteger(9);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(11);

        System.out.println("The number " + int1.getValue() + " is prime? " + int1.isPrime());
        System.out.println("The number " + int1.getValue() + " is even? " + int1.isEven());
        System.out.println("The number " + int2.getValue() + " is prime? " + int2.isPrime());
        System.out.println("The number " + int2.getValue() + " is even? " + int2.isEven());
        System.out.println("The number " + int3.getValue() + " is prime? " + int3.isPrime());
        System.out.println("The number " + int3.getValue() + " is even? " + int3.isEven());
        System.out.println("The number " + int4.getValue() + " is odd? " + int4.isOdd());
        System.out.println("The number " + int1.getValue() + " is equals to " + int4.getValue() + " " + int4.equals(int4));
        String[] array = new String[]{"4", "2", "9","3","1"};
        System.out.print(Arrays.asList(array)+" = ");
        System.out.printf("%d%n", MyInteger.parseInt(new char[]{'4', '2', '9','3', '1'}));
        System.out.printf("%d%n", MyInteger.parseInt("15"));

    }
}
