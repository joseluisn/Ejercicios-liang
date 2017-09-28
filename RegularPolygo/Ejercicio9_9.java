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
public class Ejercicio9_9 {

    public static void main(String[] args) {

        RegularPolygo[] regularPolygons = new RegularPolygo[3];
        regularPolygons[0] = new RegularPolygo();
        regularPolygons[1] = new RegularPolygo(6, 4);
        regularPolygons[2] = new RegularPolygo(10, 4, 5.6, 8.7);

        System.out.println("        Polygon table");
        System.out.println("--------------------------------------------");
        for (int i = 0; i < 3; i++) {
            System.out.println("poligon " + i);
            System.out.printf("Polygon #%d area = %.2f perimeter = %.2f\n",
                    i, regularPolygons[i].getArea(), regularPolygons[i].getPerimeter());
            System.out.println("--------------------------------------------");

        }
    }

}
