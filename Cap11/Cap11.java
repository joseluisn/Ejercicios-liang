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

        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides of a triangle: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("Enter a triangle color: ");
        String color = input.next();
        System.out.print("Is the triangle filled? true/false: ");
        String isFilledString = input.next();
        boolean isFilled = (isFilledString.equals("true"));

        Triangle t1 = new Triangle();

        t1.setColor(color);
        t1.setFilled(isFilled);
        System.out.println("Triangle 1:");

        System.out.println("Area = " + t1.getArea());
        System.out.println("Perimeter = " + t1.getPerimeter());
        System.out.println("Color = " + t1.getColor());
        System.out.println("Is filled? " + t1.isFilled());

    }

}
