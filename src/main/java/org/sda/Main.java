package org.sda;

import org.sda.exceptions.PersonNotFoundException;
import org.sda.models.Person;
import org.sda.services.PersonService;
import org.sda.services.implementations.PersonServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) throws PersonNotFoundException {


        // INTERFACE
        Person person = new Person();
        person.setFirstName("Joosep");
        person.setLastName("Korela");
        person.setAge(33);


        // Left side should be interface name and right side should be interface implementation class name
        PersonService personService = new PersonServiceImpl();

// Implementation method calls
        System.out.println("Person's birth year: " + personService.getPersonBirthYear(person.getAge()));
        System.out.println("Person's full name : " + personService.getPersonFullName(person));


        //EXCEPTION
        // Exception handling
        try {
            int[] intArray = {1, 4, 56, 8};

            for (int i = 0; i <= intArray.length; i++) {
                System.out.println(intArray[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("The number cannot be printed because its unavailable in the array");
        } catch (Exception exception) {
            System.out.println("Exception being caught");
        } finally { //This block will be executed irrespective of catch blocks
            int a = 15;
            System.out.println("Finally executed " + a);
        }

        // Combining multiple exceptions
        try {
            int y = 10 / 0;// this line should throw exception
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException e) {
            System.out.println(" The value of y is not determined, Error: " + e.getLocalizedMessage());
        }

        // Custom / user-defined exceptions
        Person testPerson = null;



        try {
            testPerson = personService.findPersonByFirstName("Karl");

        } catch (PersonNotFoundException e) {
            System.out.println(e.getLocalizedMessage());
            testPerson = new Person();
            testPerson.setFirstName("unknown");
            testPerson.setLastName("unknown last");
            testPerson.setAge(17);
        }
        System.out.println(testPerson.toString());

    }

}
