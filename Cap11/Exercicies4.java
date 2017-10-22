/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Exercicies4 {

    public static void main(String[] args) {

        Scanner n = new Scanner(System.in);
        ArrayList<Integer> Lista = new ArrayList<>();
        System.out.print("Enter integer, 0 to end ");
        int cont;
        do {
            cont = n.nextInt();
            if (cont != 0) {
                Lista.add(cont);
            }
        } while (cont != 0);

        System.out.println("The max number is " + max(Lista));
    }

    public static Integer max(ArrayList<Integer> list) {

        if (list == null || list.isEmpty()) { 
            return null;
        }

        int max = list.get(0);
            
        for  (int i=0;i<list.size();i++)  {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }

        return max;

    }

}
