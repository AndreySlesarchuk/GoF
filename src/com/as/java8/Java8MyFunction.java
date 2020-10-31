package com.as.java8;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * Created by Andrey Slesarchuk on 10/31/2020.
 */
public class Java8MyFunction {

  public static void main(String[] args) {

    // Predicate
    Predicate<Integer> isEvenNumber = x -> x % 2 == 0;

    System.out.println(isEvenNumber.test(4));
    System.out.println(isEvenNumber.test(3));

    // Consumer
    Consumer greetings = x -> System.out.println("Hello " + x + " !!!");
    greetings.accept("Elena");
    System.out.println(greetings);

    //Supplier
    ArrayList nameList = new ArrayList<>();
    nameList .add("Elena");
    nameList .add("Mike");
    nameList .add("Alan");
    nameList .add("Andrey");
    nameList .add("Tana");

    Supplier randomName = () -> {
      int value = (int)(Math.random() * nameList.size());
      return nameList.get(value);
    };

    System.out.println(randomName.get());
  }

}
