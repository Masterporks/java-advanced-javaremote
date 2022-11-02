package org.sda.generics;


/**
 *
 * Generic comparable interface
 *
 */
public interface Comparable<T> {
    /**
     * To compare two objects fields and return then better object
     * @param item is Generic
     * @return true or false
     */
    public boolean isBetter(T item);


}
