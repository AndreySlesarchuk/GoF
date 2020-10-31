package com.as.java8;

import java.util.function.Consumer;
import java.util.function.Predicate;
/**
 * Created by Andrey Slesarchuk on 10/31/2020.
 */
public class Java8MyFunction {

  public static void main(String[] args) {

    //Predicate
    Predicate<Integer> isEvenNumber = x -> x % 2==0;

    System.out.println(isEvenNumber.test(4));
    System.out.println(isEvenNumber.test(3));

    //Consumer
    Consumer greetings = x -> System.out.println("Hello " + x + " !!!");
    greetings.accept("Elena");
    System.out.println(greetings);
  }

}
