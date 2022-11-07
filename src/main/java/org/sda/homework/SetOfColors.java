package org.sda.homework;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * Set of colours homework
 *
 * @author Joosep Korela
 */


public class SetOfColors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Set<String> setOfColors = new HashSet<>();
        boolean isAdd = true;




        while (isAdd) {
            System.out.println("Type a color: ");

            setOfColors.add(scanner.next());
            System.out.println(" " + setOfColors + " Color added. Would you like  to add more colors? ");

            isAdd = scanner.nextBoolean();
        }



        System.out.println("Set of colors before sorting : " + setOfColors);


        boolean isDelete = true;



        while (isDelete) {
            System.out.println("Do you want to delete any colors? ");
            if (scanner.nextBoolean()) {
                System.out.println("Type a color you want to delete: ");
            } else {
                break;
            }

            String deleteColor = scanner.next();

            if (setOfColors.contains(deleteColor)) {
                setOfColors.remove(deleteColor);
                System.out.println(" " + deleteColor + " Successfully deleted. Do you want to delete more colors? ");

            } else {
                System.out.println("This kind of color doesn't exist in your list. Do you want to delete another color? ");
            }
            isDelete = scanner.nextBoolean();
        }

        System.out.println("Colorset before sorting: " + setOfColors);


        TreeSet<String> colorTreeSet = new TreeSet<>(setOfColors);
        System.out.println("After sorting:" + colorTreeSet);


    }

}


