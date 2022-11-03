package org.sda.generics;


/**
 *
 * Implementation of Comparable Interface
 */
public class Snack implements Comparable<Snack> {
    private final int tasteRating;
    @Override
    public boolean isBetter(Snack item) {
        return this.tasteRating > item.tasteRating;
    }

    public Snack(int tasteRating) {
        this.tasteRating = tasteRating;
    }
}