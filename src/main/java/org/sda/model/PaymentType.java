package org.sda.model;

/**
 * List of Payment
 *
 *
 */

public enum PaymentType {

    CARD(1, "Card"),
    CASH(2, "Cash"),
    BANK_TRANSFER(3, "Bank transfer"),
    MOBILE_BANKING(4, "Mobile banking"),
    BANK_LINK(5, " Bank link");

    private int value;
private String name;

    PaymentType(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Passenger's PaymentType{" +
                "value=" + value +
                ", name='" + name + '\'' +
                '}';
    }
}
