package com.as.gof.behavioral.visitor.animal;

public interface Animal {
        void accept(AnimalVisitor animalVisitor);
}
