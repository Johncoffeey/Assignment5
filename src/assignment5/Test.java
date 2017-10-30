/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import assignment5.be.Person;
import assignment5.be.GradeInfo;
import assignment5.be.Student;
import assignment5.be.Teacher;
import assignment5.bll.PersonManager;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ddose
 */
public class Test
{

    public void testPersonManager()
    {
        PersonManager pm = new PersonManager();

        Teacher t1 = new Teacher(1, "Peter", "PGN");
        Teacher t2 = new Teacher(2, "Jeppe", "JLE");

        Student s1 = new Student(101, "Anders And", "DMU");
        Student s2 = new Student(102, "Fætter Højben", "DMU");
        Student s3 = new Student(103, "Fætter Guf", "DMU");

        pm.addPerson(t1);
        pm.addPerson(t2);
        pm.addPerson(s1);
        pm.addPerson(s2);
        pm.addPerson(s3);

        System.out.println("Person count: Actual=" + pm.getAllPersons().size() + ", expected=5");
        System.out.println("Student count: Actual=" + pm.getAllStudents().size() + ", expected=3");
        System.out.println("Teacher count: Actual=" + pm.getAllTeachers().size() + ", expected=2");

        Person p = pm.getPerson(1);
        System.out.println("Person with id=1 is " + p.getName() + ", actual id=" + p.getId());

        Person pNull = pm.getPerson(3);
        System.out.println("Person with id 3 is null?: " + pNull);

        Person pDobbelganger = new Teacher(1, "bØRGE", "NaN");
        pm.addPerson(pDobbelganger);
        System.out.println("Is size still 5? Size is " + pm.getAllPersons().size());

        pm.removePerson(101);
        System.out.println("Remove test: P size = " + pm.getAllPersons().size() + "(4)");
    }

    public void testStudent()
    {
        List<Student> students = new ArrayList<>();

        Student a = new Student(300, "Danni H Dose", "Bygningskonstruktør");
        a.addGrade(new GradeInfo("SCO", 12));
        a.addGrade(new GradeInfo("SDE", 10));

        Student b = new Student(301, "ThomasBear", "HHX");
        b.addGrade(new GradeInfo("SCO", 7));
        b.addGrade(new GradeInfo("SDE", 4));

        students.add(a);
        students.add(b);

        for (Person student : students)
        {
            System.out.println(student.toString());
        }
    }

    public void testTeacher()
    {
        List<Teacher> teachers = new ArrayList<>();

        Teacher a = new Teacher(202, "Bent H. Pedersen", "bhp");
        a.addSubject("ITO");
        a.addSubject("SCO");

        Teacher b = new Teacher(203, "Simon H. Pedersen", "shp");
        b.addSubject("SCO");
        b.addSubject("SDE");
        b.addSubject("Game Dev");

        teachers.add(a);
        teachers.add(b);

        for (Person teacher : teachers) //Person or Teacher prints the same??
        {
            System.out.println(teacher.toString());
        }
    }

    public void testPerson()
    {
        List<Person> persons = new ArrayList<>();

        persons.add(new Person(100, "Hans Nielsen"));
        persons.add(new Person(101, "Niels Hansen"));
        persons.add(new Person(102, "Ib Boesen"));

        for (Person person : persons)
        {
            System.out.println(person.toString());
        }

    }

}
