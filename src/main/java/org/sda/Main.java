package org.sda;

import org.sda.homework.Animal;
import org.sda.homework.Cat;
import org.sda.homework.Dog2;
import org.sda.model.*;

import java.util.Arrays;

import static org.sda.homework.Animal.yieldVoice;

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
        Passenger passenger = new Passenger(3775844556794L,"card",PaymentType.CARD,"Tartu");
        passenger.setEmail("edfg@gmail.com"); //Access Person fields using Passenger object

        PrivatePassenger privatePassenger = new PrivatePassenger(3775844556794L,"Tallinn","card","Parnu", true,"Tartu");
        privatePassenger.setPersonalIdCode("847574848834");// Access privatePassengers field
        privatePassenger.setDestinationAddress("Tartu"); // Access passenger fields
        privatePassenger.setPhoneNumber("+37256981896"); // Access Persons field

// Overriding

        Person personOverride = new Person();
        personOverride.setEmail("joosepkorela@gmail.com");
        System.out.println(personOverride.getEmail());

        Passenger passengerOverride = new Passenger();
        passengerOverride.setEmail("joosepkorela@gmail.com");
        System.out.println(passengerOverride.getEmail());

    // Polymorphism
        Person person3 = new Person(2653572828L, "parnu");
        Person person4 = new Passenger(43747483L,"tartu",PaymentType.CASH, "Viljandi");

        System.out.println(person3.toString());
        System.out.println(person4.toString());

        // Calling parent methods

        Passenger passenger1 = new Passenger();
        passenger1.setAddress("Tallinn");// Persons address
        passenger1.setDestinationAddress("Tartu");// Passenger address
        System.out.println(passenger1.getAddresses());


        // calling parent's hidden field
        passenger1.getHiddenAlive();

        //passing parameters
        Passenger passenger2 = new Passenger(3455544L,"Tallinn", PaymentType.BANK_LINK, "Tartu");
        printPersonAddress((passenger2));
        printPassengerPrefixWithPrefix("Person: ", passenger2);


        //Composition exercise Muzzle
        Muzzle muzzle = new Muzzle();
        muzzle.setId(45675L);
        muzzle.setNoiseRange(45);
        muzzle.setTooNoisy(true);

        Dog dog1 = new Dog(true,"Doggie");
        dog1.setMuzzle(muzzle);
        System.out.println(dog1.getMuzzle().toString());

//enums
        System.out.println(PaymentType.CARD); // prints enum CARD
        System.out.println(Arrays.toString(PaymentType.values())); // prints all the enum values

        System.out.println(PaymentType.BANK_LINK.getValue()); // prints the value of enum

// looping enums
        for(PaymentType paymenttype: PaymentType.values()){
            System.out.println(paymenttype.name());
        }
        // enum method overriding
        System.out.println(PaymentType.MOBILE_BANKING.toString());

        //Enum exercise
        System.out.println(">>>>>>>>>>>>>>>>PLANETS<<<<<<<<<<<<<<<");
        System.out.println(Planets.JUPITER.toString());
        System.out.println("Distance of " + Planets.JUPITER.name() + " from Earth: " + Planets.JUPITER.distanceFromEarth() );

        System.out.println(Planets.MARS.toString());
        System.out.println("Distance of " + Planets.MARS.name() + " from Earth: " + Planets.MARS.distanceFromEarth() );




        Dog2 dog3 = new Dog2();
        dog3.setName("Juhan");
        Cat cat1 = new Cat();
        cat1.setName("Ants");
        Animal.yieldVoice();

        Animal[] animals = Animal.yieldVoice();

        for(Animal animal : animals){
            Animal.yieldVoice();
            System.out.println(Arrays.toString(animals));
            break;
        }
        System.out.println(dog3.getName());
        System.out.println(cat1.getName());






    }





    private static void printPersonAddress(Person person){

        System.out.println(person.getAddress());
    }

    private static void printPassengerPrefixWithPrefix(String prefix, Object object){
        System.out.println(prefix + object);
    }




}