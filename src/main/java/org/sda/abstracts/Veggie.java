package org.sda.abstracts;

/**
 *
 * Veggie class extending the abstract class
 */

public class Veggie extends Food{

    public Veggie(String color) {
        super(color);
    }

    @Override
    public void eat() {
        System.out.println("I am eating a " + super.getColor() + " veggie...");
    }
}
