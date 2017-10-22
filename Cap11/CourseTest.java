/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

import java.util.Scanner;
import cap11.Triangle;
import cap11.GeometricObject;
import java.util.Arrays;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class CourseTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

         Courses course = new Courses("Paradigmas ");

        course.addStudent("Jose Luis Novoa");    
        course.addStudent("Miguel Perez");
        course.addStudent("Ana Maria Camacho");
        course.addStudent("Juan Diego Novoa");
         course.addStudent("Antonella Novoa");
        course.dropStudent("Miguel Perez");
        

        String[] students = course.getStudents();

        System.out.println("Number of students in " + course.getCourseName() + course.getNumberOfStudents());
        System.out.println(Arrays.toString(students));


    }

}
