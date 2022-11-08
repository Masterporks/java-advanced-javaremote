package org.sda;

import org.sda.model.Person;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //LAMBDA EXPRESSION
        //Predicate

        Person person = new Person("Joosep", "Korela", 20);
        Predicate<Person> personTest = test -> test.getAge() > 20; // lambda expression
        System.out.println(personTest.test(person));

        //Function interface
        //New way of writing method
        Function<String, Integer> getStringLen = s -> {
            int increment = 10;
            return s.length() + increment;
        };


        System.out.println(getStringLen.apply("Java is not easy. Joke ;)"));

        //Method reference

        Predicate<Person> personTest2 = Person::isAdult; // method reference --Classname :: MethodName
        System.out.println(personTest2.test(person));


        //Supplier -  Doesn't take any arguments but returns / supplies only the value
        Supplier<Integer> randomNumberSupplier = () -> new Random().nextInt(); //No argument but returns to random value
        System.out.println(randomNumberSupplier.get());   // get() should be called always


        //Consumer - just to print the values. It takes an argument and returns nothing

        Consumer<Person> printPerson = p -> System.out.println("Person first name: " + p.getFirstName() + " last name: " + p.getLastName());
        printPerson.accept(person); // accept() should be called always


        //OPERATOR
        UnaryOperator<Integer> toSquare = i -> i * i;
        System.out.println(toSquare.apply(4)); // apply() should be always called


        //OPTIONAL
        Person person3 = new Person("Tony", "Stark", 54);
        Optional<Person> optionalPerson = Optional.of(person3);


        if (optionalPerson.isEmpty()) {
            System.out.println("Person can not be printed");
        } else {
            System.out.println(optionalPerson.get().toString());
        }

        optionalPerson.ifPresent(System.out::println); // same as previous one but with lambda

        System.out.println(getRandomPerson().toString());

        // STREAMS

        List<String> carList = List.of("BMW", "AUDI", "SKODA", "TOYOTA", "FORD");
        carList.stream()
                .findFirst()
                .ifPresent(System.out::println); // findFirst() -> Optional<T>
        carList.stream()
                .findAny()
                .ifPresent(System.out::println); // findAny() -> Optional<T> -->Find random element in the list

        // Filter: Used to apply a condition to the list and filter the list

        List<String> filteredCarList = carList.stream()
                .filter(s -> s.length() >= 5)  // Filter returns Stream<T>
                .collect(Collectors.toList());  //Convert Stream<T> to List<T>


        filteredCarList.forEach(s -> {
            String prefix = "Car: " + s;
            System.out.println(prefix);
        });

        //Map: Used to apply an operation to all elements of the list
        List<Integer> carLength = carList
                .stream()
                .map(String::length)
                .collect(Collectors.toList());
        carLength.forEach(System.out::println);

        // allMatch(): used to check all the elements in the list matching an given condition
        boolean isAllCarsGreaterThanFive = carList.stream()
                .allMatch(s -> s.length() >= 5);
        System.out.println(isAllCarsGreaterThanFive);
        //anyMatch(): used to check if least one element in the list matches the given condition
        boolean isAnyCarStartingWithB = carList.stream()
                .anyMatch(s -> s.startsWith("B"));
        System.out.println(isAnyCarStartingWithB);

        //reduce(): used to condense/reduce the list to String or other type
        String cars = carList.stream()
                .reduce(" ", ((s, s2) -> (s.equals(" ") ? "" : s + ", ") + s2));
        System.out.println(cars);

        // sorted(): Used to sort the list in the ascending order
        carList.stream()
                .sorted()
                .forEach(System.out::println);

        // descending order sorting
        carList.stream()
                .sorted((car1, car2) -> car2.compareTo(car1))
                .forEach(System.out::println);

        // alternative descending order using Comparator
        carList.stream()
                .sorted(Comparator.reverseOrder())
                .forEach(System.out::println);





    }

    //Old-school way of method definition
    private static Integer getLengthOfString(String inputString){
        int increment = 10;
        return inputString.length() + increment;
    }



// orElse example
    private static Person getRandomPerson(){

        //Optional<Person> optionalPerson = Optional.empty();
        Optional<Person> optionalPerson = Optional.of(new Person("Captain", "Estonia" ,44));
        Person person2 = new Person("Marek", "Austin", 33); //Backup substitute
        return optionalPerson.orElse(person2);

    }
}