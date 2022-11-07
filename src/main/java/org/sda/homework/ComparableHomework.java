package org.sda.homework;
/**
 * Homework
 *
 * @author Joosep Korela
 */


/**
 * Compare two object fields and return to taller object
 *
 * @param <T> Generic
 * @return true or false
 */
public interface ComparableHomework<T> {

    boolean isTaller(T item);

    boolean compareTo(T item);
}