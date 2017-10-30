/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5.be;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Danni
 */
public class Teacher extends Person
{

    private List<String> subjects;
    private String initials;
    private double salary;

    public Teacher(int id, String name, String initials)
    {
        super(id, name);
        subjects = new ArrayList<>();
        this.initials = initials;
    }

    /**
     * Get the value of subjects
     *
     * @return the value of subjects
     */
    public List<String> getSubjects()
    {
        return subjects;
    }

    /**
     * Get the value of initials
     *
     * @return the value of initials
     */
    public String getInitials()
    {
        return initials;
    }

    /**
     * Get the value of salary
     *
     * @return the value of salary
     */
    public double getSalary()
    {
        return salary;
    }

    /**
     *
     * @param subject
     */
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }

    /**
     * Set the value of salary
     *
     * @param salary new value of salary
     */
    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    @Override
    public String toString()
    {
        return super.toString() + " " + initials + " " + subjects.get(1);
    }

}
