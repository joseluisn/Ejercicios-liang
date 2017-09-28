/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap10.Course;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Course {

    private String courseName;
    private String[] students;
    private int numberOfStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new String[1];
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

    public String getCourseName() {
        return courseName;
    }

    public void addStudent(String student) {
        if (numberOfStudents >= students.length) {
            String[] temp = new String[students.length + 1];
            System.arraycopy(students, 0, temp, 0, students.length);
            students = temp;
        }
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public void dropStudent(String student) {
        for (int i = 0; i < students.length - 1; i++) {

            if (student.equalsIgnoreCase(students[i])) {
                numberOfStudents--;
                while (i < numberOfStudents) {
                    students[i] = students[i + 1];
                   i++;
                   
                }
            }
        }
    }

    public void clear() {
        String[] temp = new String[1];
        students = temp;
        numberOfStudents = 0;
    }

}
