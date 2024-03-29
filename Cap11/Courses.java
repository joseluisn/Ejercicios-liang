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
public class Courses {

    private String courseName;
    private ArrayList<String> students = new ArrayList<>();

    public Courses(String courseName) {
        this.courseName = courseName;
    }

    public String[] getStudents() {
        return students.toArray(new String[students.size()]);
    }

    public int getNumberOfStudents() {
        return students.size();
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        students.add(student);
    }

    public void dropStudent(String student) {
        students.remove(student);
    }

    public void clear() {
        students.clear();
    }

}
