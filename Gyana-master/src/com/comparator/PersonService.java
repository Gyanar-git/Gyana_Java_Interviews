package com.comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class PersonService {

    /*
    compareTo() is a method of the interface Comparable, so it is used to compare THIS instance to another one.
    compare() is a method of the interface Comparator, so it is used to compare two different instances of another class with each other.
     */

    public static List<Person> getPersons(List<Person> persons){
//        Collections.sort(persons, new Comparator<Person>() {
//            @Override
//            public int compare(Person o1, Person o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });

        Collections.sort(persons, (p1, p2) -> p1.getName().compareTo(p2.getName()));
        return persons;

    }
}
