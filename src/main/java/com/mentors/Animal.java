package com.mentors;

public abstract class Animal {
    int age;

    public Animal(int age) {
        this.age = age;
    }

    public abstract void sayHello();

    public void scratch() {
        System.out.println("Blood!");
    }

    public abstract void sleep(int duration);
}
