package org.sda.generics;

/**
 *
 * Generic food class
 *
 */

public class GenericFood<T> {
    private T item; // private fruit item;

    public GenericFood(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }

    public void setItem(T item) {
        this.item = item;
    }
}
