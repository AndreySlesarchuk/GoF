package com.as.gof.behavioral.visitors.animal;
/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public class Main {
    public static void main(String[] args) {
        Animal animal = new Cat();
        animal.accept(new SoundVisitor());
    }
}
