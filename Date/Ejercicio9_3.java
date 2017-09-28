/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Date;

import java.util.Date;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_3 {

    public static void main(String[] args) {
        long time = 10000;
        for (int t = 0; t < 8; t++) {
            Date date = new Date(time);
            System.out.println(date.toString());
            time *= 10;
        }
    }
}
