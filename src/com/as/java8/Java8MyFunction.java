package com.as.java8;

import java.util.function.Predicate;

public class Java8MyFunction {

  public static void main(String[] args) {
    Predicate<Integer> isEvenNumber = x -> x % 2==0;

    System.out.println(isEvenNumber.test(4));
    System.out.println(isEvenNumber.test(3));
  }

}
