package com.as.gof.behavioral.visitors.animal;
/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public class Cat implements Animal{
    @Override
    public void accept(AnimalVisitor animalVisitor) {
        animalVisitor.action(this);
    }
}
