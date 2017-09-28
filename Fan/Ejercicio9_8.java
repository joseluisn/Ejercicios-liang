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
public class Ejercicio9_8 {

    public static void main(String[] args) {
        Fan fan = new Fan();
        fan.setSpeed(Fan.FAST);
        fan.setOn(true);
        fan.setRadius(10);
        fan.setColor("yellow");

        Fan fan1 = new Fan();
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setRadius(5);
        fan1.setColor("blue");
        fan1.setOn(false);

        System.out.println("Fan 1: " + fan.toString());
        System.out.println("Fan 2: " + fan1.toString());
    }
}
