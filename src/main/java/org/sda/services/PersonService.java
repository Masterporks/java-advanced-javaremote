package org.sda.services;


import org.sda.models.Person;

import java.time.LocalDate;

/**
 * PersonService interface to handle PErson related operations
 *
 * @author Joosep Korela
 */
public interface PersonService {
    //Static field is allowed but not the normal field
    static final int AVERAGE_AGE = 20;

    /**
     * To get the birth year of a Person
     *
     * @param age Age of a person
     * @return Birth year
     */
    int getPersonBirthYear(int age);

    /**
     * To get full name the person
     * @param person Person model
     * @return Full name as String
     */
    String getPersonFullName(Person person);


    /**
     *T o find Person by first name
     * @param firstname Firstname of person
     * @return Person
     */
    Person findPersonByFirstName(String firstName);



    //Static method definition is allowed
    static int getAverageAge(){
        return AVERAGE_AGE;
    }


}
