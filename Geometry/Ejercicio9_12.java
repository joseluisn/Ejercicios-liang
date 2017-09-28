/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Geometry;

import cap9.LinearEquation.LinearEquation;
import java.util.Scanner;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_12 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
          

        System.out.print("Enter x1, y1, x2, y2, x3, y3, x4, y4: ");
        double[][] points = new double[4][2];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points[i].length; j++) {
                points[i][j] = input.nextDouble();
            }
        }
        
    //   LinearEquation line = new LinearEquation(points);

    }
}
