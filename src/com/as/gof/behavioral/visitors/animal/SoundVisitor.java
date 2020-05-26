package com.as.gof.behavioral.visitors.animal;
/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public class SoundVisitor implements AnimalVisitor{
    @Override
    public void action(Cat cat) { System.out.println("mao"); }

    @Override
    public void action(Dog dog) {
        System.out.println("wof");
    }
}
