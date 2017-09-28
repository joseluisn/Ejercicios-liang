/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Cap10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
           Time time = new Time(555550000);
        Time time2 = new Time();

        System.out.printf("%d:%d:%d%n%n", time.getHour(), time.getMinute(), time.getSecond());
        System.out.printf("%d:%d:%d%n%n", time2.getHour(), time2.getMinute(), time2.getSecond());
        
       
    }
}
