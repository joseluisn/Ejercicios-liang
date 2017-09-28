/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.BMI;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio_102 {
     public static void main(String[] args) {
        // TODO code application logic here
          BMI bmi= new BMI("Jose Luis", 24, 80,80 ,80);  
          
          System.out.println("The sir or lady "+bmi.getName()+" has "+bmi.getStatus());
       
    }
    
}
