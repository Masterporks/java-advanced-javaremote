package org.sda;

import org.sda.model.*;

public class Main {
    public static void main(String[] args){
        //ENCAPSULATION
        // No argument constructor call
        Person person = new Person();
        System.out.println(person.toString());
        System.out.println(person.getId());


        // All argument constructor call
        Person person1 = new Person(12345L,"Joosep","Korela","abc@gmail.com","+37256981896","Turu 9 Tartu");
        System.out.println(person1.toString());
        System.out.println(person1.getEmail());


        Person person2 = new Person();
        person2.setFirstName("Tony");
        person2.setLastName("Sheep");

        System.out.println(person2.getFirstName());
        System.out.println(person2.getLastName());


        Dog dog = new Dog(true, "German Shepperd");
        System.out.println(dog.toString());
        System.out.println(dog.getAge());
        System.out.println(dog.getWeight());

        //INHERITANCE
        Passenger passenger = new Passenger(3775844556794L,"card","Parnu","Tartu");
        passenger.setEmail("edfg@gmail.com"); //Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger(3775844556794L,"Tallinn","card","Parnu", true,"Tartu");
        privatePassenger.setPersonalIdCode("847574848834");// Access privatePassengers field
        privatePassenger.setDestinationAddress("Tartu"); // Access passenger fields
        privatePassenger.setPhoneNumber("+37256981896"); // Access Persons field


    }

}