package org.sda.homework;

/**
 * Homework
 *
 *
 * @author Joosep Korela
 */
public class Person implements ComparableHomework<Person> {

    private int height;


    public Person(int height) {this.height = height;}

    @Override
    public boolean isTaller(Person item) {return this.height > item.height;}

    public boolean compareTo(Person person2) {return this.height > person2.height;}
}
