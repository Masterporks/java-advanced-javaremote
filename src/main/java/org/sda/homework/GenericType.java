package org.sda.homework;

import java.util.ArrayList;
import java.util.List;


/**
 * Generic Type homework
 * @author Joosep Korela
 */
public class GenericType<T> {


    @Override
    public String toString() {
        return "GenericType{" +
                "items=" + items +
                '}';
    }

    private T items;

    public static <T> void main(String[] args) {


        List<String> itemsList = new ArrayList<>();
        itemsList.add("Veggie");
        List<Integer> itemsList2 = new ArrayList<>();
        itemsList2.add(4);
        List<Double> itemsList3 = new ArrayList<>();
        itemsList3.add(3.2d);

        List<T> allItems = (List<T>) List.of(itemsList, itemsList2, itemsList3);
        System.out.println(allItems);

        for(T itemList: allItems){
            System.out.println(itemList);
        }
    }



}