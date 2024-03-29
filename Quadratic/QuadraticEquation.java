/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Quadratic;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class QuadraticEquation {

    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return Math.pow(b, 2) - 4.0 * a * c;

    }

    public double getRoot1() {
        return (-b +Math.sqrt(Math.pow(b,2)-4*a*c)) / (2.0 * a);
    }

    public double getRoot2() {
        return (-b -Math.sqrt(Math.pow(b,2)-4*a*c)) / (2.0 * a);
    }

}
