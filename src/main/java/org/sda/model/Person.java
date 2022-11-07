package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * Person model
 *
 * @author Joosep Korela
 */
@AllArgsConstructor
@Getter
@Setter
public class Person {
    private String firstName;
    private String lastName;
    private int age;


    public boolean isAdult(){
        return age >=18;
    }

}
