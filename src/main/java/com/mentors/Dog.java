package com.mentors;

public class Dog extends Animal {
    String nickname;

    public Dog(int age, String nickname) {
        super(age);
        this.nickname = nickname;
    }

    public void sayHello() {
        System.out.println("Bark, my name is " + nickname);
    }

    @Override
    public void sleep(int duration) {
        String sleep = "";
        for (int i = 0; i < duration; i++) {
            sleep += "Z";
        }
        System.out.println(sleep);
    }

    public void sleep() {
        System.out.println("ZZZZZ");
    }
}
