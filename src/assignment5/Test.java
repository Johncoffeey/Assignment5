/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment5;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ddose
 */
public class Test
{

    public void test()
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
