/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cap11;

/**
 *
 * @author JOSE LUIS NOVOA
 */
public class Faculty extends Employee {

    public static String PROFESSOR = "Professor";
    public static String LECTURER = "Lecturer";
    protected String officeHours;
    protected String rank;

    public Faculty(String name) {
        this(name, "8-6PM", "Employee");
    }

    public Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + " Class: " + this.getClass().getName();
    }

}
