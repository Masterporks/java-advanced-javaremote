package org.sda.generics;


import lombok.*;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Fruit class for Generic
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Fruit implements Serializable { // this class can be Serialized and Deserialized
    private String name;
    private String color;
    private BigDecimal price;
}
