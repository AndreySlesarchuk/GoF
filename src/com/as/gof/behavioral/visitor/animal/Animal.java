package com.as.gof.behavioral.visitor.animal;

/**
 * Created by Andrey Slesarchuk on 05/25/2020.
 */
public interface Animal {
  void accept(AnimalVisitor animalVisitor);
}
