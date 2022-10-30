package org.sda.homework;

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

    Cat cat = new Cat("MEOW",2,"Ants",true);
    Dog2 dog2 = new Dog2("WOOF",10, "Juhan",true);
    return new Animal[]{cat,dog2};


}

}