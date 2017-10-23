/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

import java.util.ArrayList;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Exercises7 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println("List");
        System.out.println(list);
        System.out.println("After shuffling ");
        shuffle(list);
        System.out.println(list);
    }

    public static void shuffle(ArrayList<Integer> list) {

        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            int temp = list.get(randomIndex);
            list.set(randomIndex, list.get(i));
            list.set(i, temp);
        }

    }

}
