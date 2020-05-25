package com.as.gof.behavioral.visitors.animal;

public interface Animal {
    void accept(AnimalVisitor animalVisitor);
}
