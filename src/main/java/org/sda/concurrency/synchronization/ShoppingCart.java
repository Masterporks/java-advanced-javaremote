package org.sda.concurrency.synchronization;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 *
 *Synchronization base class
 */
@AllArgsConstructor
@Getter
@Setter
public class ShoppingCart {
    private int numberOfProducts;

    public synchronized void addProduct(int quantity) {
        System.out.println("Adding products...");

        // code block synchronization
        synchronized (this) {
            numberOfProducts += quantity;
        }
    }

    //Method synchronization
    public synchronized void removeProduct(int quantity){
        System.out.println("Deleting products...");
        numberOfProducts -= quantity;

    }

}
