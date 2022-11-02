package org.sda;

import org.sda.generics.*;

import java.math.BigDecimal;

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

    }

}