package org.sda.homework;

public class Cat extends Animal{


    public Cat(){

    }
    public boolean isChasingMouse;

    public Cat(String yieldVoice, int age, String name, boolean isChasingMouse) {
        super(yieldVoice, age, name);
        this.isChasingMouse = isChasingMouse;
    }

    public boolean isChasingMouse() {
        return isChasingMouse;
    }

    public void setChasingMouse(boolean chasingMouse) {
        isChasingMouse = chasingMouse;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "isChasingMouse=" + isChasingMouse +
                ", yieldVoice='" + yieldVoice + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
