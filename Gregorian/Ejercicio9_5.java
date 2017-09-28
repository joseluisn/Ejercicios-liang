/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap9.Gregorian;

import java.util.GregorianCalendar;
import java.util.Calendar;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio9_5 {

    public static void main(String[] args) {

        Calendar date = new GregorianCalendar();
        int year= date.get(GregorianCalendar.YEAR);
        int month = date.get(Calendar.MONTH);
        int day= date.get(GregorianCalendar.DAY_OF_MONTH);
        
        System.out.println("Current Date " + year + "-" + month + "-" +day);

        long millis = 1234567898765L;

        date.setTimeInMillis(millis);
        System.out.println("Date at " + date.get(GregorianCalendar.YEAR) + "-" + date.get(GregorianCalendar.MONTH) + "-" + date.get(GregorianCalendar.DAY_OF_MONTH));
        
    }

}
