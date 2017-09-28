/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Random;

import java.util.Random;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_4 {

    public static void main(String[] args) {
        Random random = new Random(1000);

        for (int i = 0; i < 50; i++) {

            System.out.print(random.nextInt(100) + " ");
            if (i == 9 || i == 19 || i == 29 || i == 39 || i == 49) {
                System.out.println("\n");
            }
        }

    }

}
