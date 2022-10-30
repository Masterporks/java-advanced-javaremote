package org.sda.homework;

import org.sda.model.Dog;

public class Animal {

    public String yieldVoice;
    public int age;
    public String name;

    public Animal(String yieldVoice, int age, String name) {
        this.yieldVoice = yieldVoice;
        this.age = age;
        this.name = name;
    }

    public Animal() {

    }

    public String getYieldVoice() {
        return yieldVoice;
    }

    public void setYieldVoice(String yieldVoice) {
        this.yieldVoice = yieldVoice;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public static Animal[] yieldVoice(){


        Dog2 dog3 = new Dog2("Whoof-whoof",4, "Dog",true);

        Cat cat1 = new Cat("Meow",2, "Cat",true);


        return new Animal[] {dog3, cat1};


}

}