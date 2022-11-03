package org.sda.generics;


import lombok.*;

import java.math.BigDecimal;

/**
 * Fruit class for Generic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fruit {
    private String name;
    private String color;
    private BigDecimal price;
}
