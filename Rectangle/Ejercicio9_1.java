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
public class Ejercicio9_1 {

    public static void main(String[] args) {
        Rectangle[] rect = new Rectangle[2];
        rect[0] = new Rectangle(4, 40);
        rect[1] = new Rectangle(3.5, 35.9);
        
        for (int i = 0; i < 2; i++){
            System.out.println("Rectangle " + (i+1) );
            System.out.println("Area " + rect[i].getArea());
            System.out.println("Perimeter " +  rect[i].getPerimeter() +"\n");
        }
       
    }

}
