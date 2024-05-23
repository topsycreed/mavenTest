package com.mentors;

public class Cat extends Animal {
    String nickname;

    public Cat(int age, String nickname) {
        super(age);
        this.nickname = nickname;
    }

    public void sayHello() {
        System.out.println("Meow, my name is " + nickname);
    }

    @Override
    public void scratch() {
        System.out.println("SDFgfdgdfh!!!!1");
    }

    @Override
    public void sleep(int duration) {
        String sleep = "";
        for (int i = 0; i < duration; i++) {
            sleep += "z";
        }
        System.out.println(sleep);
    }
}
