/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Rectangle;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Rectangle {

    private double width, height;

    public Rectangle() {
        this.height = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double width, double height) {
        this.height = height;
        this.width = width;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return this.width * 2 + this.height * 2;
    }

}
