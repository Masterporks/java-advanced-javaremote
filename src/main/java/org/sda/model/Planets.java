package org.sda.model;

/**
 * Enum exercise
 *1. Create enum Planets.
 * a) Override toString method. It should print relative size of a planet and it’s name.
 * E.g. „Huge Jupiter”, „Small Pluto”.
 * b) Create distanceFromEarth method.
 * c) Verify both methods for multiple planets
 * @author Joosep Korela
 */



public enum Planets {
    MARS(2500000,"Adjacent Mars"),
    EARTH(34999,"MY Earth"),
    JUPITER(26000000,"Huge Jupiter"),
    SATURN(27000000,"Ring Saturn"),
    PLUTO(4000000,"SmallPluto"),
    VENUS(500000, "Evening star Venus");

    private float relativeSize;
    private String name;

    Planets(float relativeSize, String name) {
        this.relativeSize = relativeSize;
        this.name = name;
    }

    public void setRelativeSize(float relativeSize) {
        this.relativeSize = relativeSize;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Planets{" +
                "relativeSize=" + relativeSize +
                ", name='" + name + '\'' +
                '}';
    }
    public double distanceFromEarth(){

        return EARTH.relativeSize - this.relativeSize;
    }
}
