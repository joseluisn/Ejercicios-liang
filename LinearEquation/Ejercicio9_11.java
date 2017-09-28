/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.LinearEquation;
import java.util.Scanner;
/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_11 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner op = new Scanner(System.in);
        int a, b, c, d, e, f =0;

        System.out.println("Ingrese valor para A");
        a = op.nextInt();
        System.out.println("Ingrese valor para B");
        b = op.nextInt();
        System.out.println("Ingrese valor para C");
        c = op.nextInt();
        System.out.println("Ingrese valor para D");
        d = op.nextInt();
        System.out.println("Ingrese valor para E");
        e = op.nextInt();
        System.out.println("Ingrese valor para F");
        f = op.nextInt();
        

        LinearEquation ob = new LinearEquation(a, b, c, d, e, f);
        ob.getA();
        ob.getB();
        ob.getC();
        ob.getD();
        ob.getE();
        ob.getF();
        if (ob.isSolvable() == false) {
            System.out.println("La ecuacion no tiene solucion");
        } else {

            System.out.println("El valor de x = " + ob.getX());
            System.out.println("El valor de y = " + ob.getY());
        }

    }
    
}
