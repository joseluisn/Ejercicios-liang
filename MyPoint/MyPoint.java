/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.MyPoint;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class MyPoint {

    private double x, y;

    public MyPoint() {
        this.x = 0;
        this.y = 0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double distance(double x, double y) {
        return Math.sqrt(Math.pow(x - this.x, 2) + Math.pow(y - y - this.y, 2));

    }

    public double distance(MyPoint a) {
        return Math.sqrt(Math.pow(a.getX() - this.x, 2) + Math.pow(a.getY() - this.y, 2));
    }

}
