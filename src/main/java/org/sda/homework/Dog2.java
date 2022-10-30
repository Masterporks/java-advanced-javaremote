package org.sda.homework;

public class Dog2 extends Animal{

    public Dog2() {

    }

    public boolean isBestFriend;

    public Dog2(String yieldVoice, int age, String name, boolean isBestFriend) {
        super(yieldVoice, age, name);
        this.isBestFriend= isBestFriend;
    }

    public boolean isBestFriend() {
        return isBestFriend;
    }

    public void setBestFriend(boolean bestFriend) {
        isBestFriend = bestFriend;
    }

    @Override
    public String toString() {
        return "Dog2{" +
                "yieldVoice='" + yieldVoice + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
