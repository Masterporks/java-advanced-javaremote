package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        // GENERIC TYPE
        Fruit fruit = new Fruit();
        fruit.setName("Apple");
        fruit.setColor("Green");
        fruit.setPrice(BigDecimal.valueOf(1.99)); // converting a double to BigDecimal
        GenericFood<Fruit> genericFoodWithFruit = new GenericFood<>(fruit);
        System.out.println(genericFoodWithFruit.getItem());

        String str = "Eminem is awesome";
        GenericFood<String> genericFoodWithString = new GenericFood<>(str);
        System.out.println(genericFoodWithString.getItem());

        genericFoodWithString.setItem("I am a good person");
        System.out.println(genericFoodWithString.getItem());
        //GENERIC TYPE EXTENDS

        Vegetable vegetable = new Vegetable();
        GenericExtendFood<Vegetable> vegetableGenericExtendFood = new GenericExtendFood<>(vegetable);
        System.out.println(vegetableGenericExtendFood.getRating());

        // GENERIC TYPE INTERFACE
        Snack snack1 = new Snack(5);
        Snack snack2 = new Snack(2);
        System.out.println("Snack 1 is better than Snack 2: " + snack1.isBetter(snack2));

        List<String> animalList = new ArrayList<>();
        animalList.add("Lion"); // 0
        animalList.add("Tiger"); // 1
        animalList.add("Cow"); // 2
        animalList.add("Cat");
        animalList.add("Bear");
        animalList.add("Panda");
        System.out.println(animalList.get(1)); // prints Tiger

        animalList.remove(1); // tiger will be deleted
        animalList.remove("Cow");


        for (String animal: animalList){
            System.out.println(animal);
        }
        Iterator<String> stringIterator = animalList.listIterator();

        while(stringIterator.hasNext()){
            System.out.println(stringIterator.next() + " , ");
        }
        // List of items to be removed
        List<String> removeAnimalList = new ArrayList<>();
        removeAnimalList.add("Cat");
        removeAnimalList.add("Panda");

        animalList.removeAll(removeAnimalList);
        // Final Removed list
        for (String animal: animalList){
            System.out.println(animal);
        }




    }

}