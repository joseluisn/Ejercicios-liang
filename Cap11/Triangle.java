/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Triangle extends GeometricObject {

    private double side1, side2, side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public Triangle() {
        this.side1 = 1.0;
        this.side2 = 1.0;
        this.side3 = 1.0;
    }

    public double getArea() {
        double area = (side1 + side2 + side3) / 2.0;
        return Math.sqrt(area*(area-side1)*(area-side2)*(area-side3));
        
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    public String toString() {
        return "Triangle{" + "side1=" + side1 + ", side2=" + side2 + ", side3=" + side3 + '}';
    }
   
    public double getSide1() {
        return side1;
    }

   

    public double getSide2() {
        return side2;
    }

   

    public double getSide3() {
        return side3;
    }

   
}
