package org.sda.exceptions;


/**
 *
 * Exception to handle if the person is not found
 *
 */

public class PersonNotFoundException extends Exception {
    public PersonNotFoundException(String name){
        super(String.format("The person (%s) is not found!", name));

    }

}
