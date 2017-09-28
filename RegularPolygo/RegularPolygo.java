/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.RegularPolygo;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class RegularPolygo {

    private int n=3;
    private double side=1, x=0,y=0;

    public RegularPolygo() {
       
    }

    public RegularPolygo(int numberOfSides, double sideLength) {
        this();
        this.side = sideLength;
        this.n = numberOfSides;

    }

    public RegularPolygo(int numberOfSides, double sideLength, double x, double y) {
        this.n = numberOfSides;
        this.side = sideLength;
        this.x = x;
        this.y = y;
    }

    public int getNumberOfSides() {
        return n;
    }

    public void setNumberOfSides(int numberOfSides) {
        n = numberOfSides;
    }

    public double getSideLength() {
        return side;
    }

    public void setSideLength(double sideLength) {
        side = sideLength;
    }

    public double getCenterY() {
        return y;
    }

    public void setCenterY(double centerY) {
        y = centerY;
    }

    public double getCenterX() {
        return x;
    }

    public void setCenterX(double centerX) {
        x = centerX;
    }

    public double getPerimeter() {
        return n * side;
    }

    public double getArea() {
        return (n * side * side) / (4.0 * Math.tan(Math.PI / n));
    }

}
