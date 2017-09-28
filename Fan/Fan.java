/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Fan;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Fan {

    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        speed = 1;
        radius = 5;
        color = "blue";
    }
    
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        if (isOn()) {
            return "Speed: " + getSpeed() + " Color: " + getColor() + " Radius: " + getRadius();
        } else {
            return "Color: " + getColor() + " Radius: " + getRadius() + ". The fan is OFF.";
        }
    }

}
