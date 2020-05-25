package com.as.gof.behavioral.visitors.animal;
/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public class EatVisitor implements AnimalVisitor{
    @Override
    public void action(Cat cat) {
        System.out.println("eat fish");
    }

    @Override
    public void action(Dog dog) {
        System.out.println("eat meat");
    }
}
