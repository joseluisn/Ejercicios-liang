/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Quadratic;

import java.util.Scanner;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_10 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        double discriminant = equation.getDiscriminant();

        if (discriminant < 0) {
            System.out.println("The equation has no roots, would have imaginary numbers");

        } else if (discriminant > 0) {
            System.out.println("The roots are " + equation.getRoot1() + " and " + equation.getRoot2());
        } else {

            System.out.println("The root is " + equation.getRoot1());
        }
    }
}
