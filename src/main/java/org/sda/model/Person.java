package org.sda.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * Person model
 *
 * @author Joosep Korela
 */
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Person {   //Outer class
    private String firstName;
    private String lastName;
    private String userName;
    private int age;


    public boolean isAdult(){
        return age >=18;
    }



    @Getter
    @Setter
    @ToString
    //Non-static nested class - bound to outer class
    public class Employee{ // Inner Class
        private String address;

        public void  userName() {
            userName = firstName.concat(lastName).toLowerCase().replace(" ", "");  // changing the value of outer-class

        }

    }


    // Static nested class: not boud to outer class
    @Getter
    public static class Customer{
        public void username(Person person){
            person.userName = person.firstName.concat(person.lastName).toUpperCase().replace(" ", "");

        }

    }
}
