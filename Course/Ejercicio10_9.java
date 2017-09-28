/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.Course;

import java.util.Arrays;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Ejercicio10_9 {

    public static void main(String[] args) {
        Course course = new Course("Paradigmas ");

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
