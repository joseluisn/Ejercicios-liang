/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.StopWatch;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_6 {

    public static void main(String[] args) {
        java.util.Random r = new java.util.Random();
        StopWatch stopWatch = new StopWatch();
        int[] numbers = new int[100000];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = r.nextInt(10000);
        }

        selectionSort(numbers);
        stopWatch.stop();

        System.out.println("The execution time of sorting 100,000 number is " + stopWatch.getElapsedTime() + " milliseconds");
    }

    public static void selectionSort(int[] list) {
        for (int i = 0; i < list.length; i++) {
            int currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }

            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
    }

}
