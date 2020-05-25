package com.as.gof.behavioral.visitors.animal;

public class SoundVisitor implements AnimalVisitor{
    @Override
    public void action(Cat cat) {
        System.out.println("mao");
    }

    @Override
    public void action(Dog dog) {
        System.out.println("wof");
    }
}
