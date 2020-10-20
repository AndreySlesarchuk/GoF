package com.as.expressions.lambda;

import java.util.function.Consumer;

/**
 * Created by Slesarchuk on 10/19/2020.
 */
public class MyNumber {
  public static void main(String[] args) {

    Consumer<Object> myMethod = (n) -> {
      if (n instanceof Integer) {
        System.out.println("And this number - " + n + "!");
      } else {
        System.out.println("Hello Word and " + n + "!");
        return;
      }
    };
    
    iNumber myNumber1 = (i, t) -> {
      int a;
      if (i < t)
        a = i;
      else
        a = t;
      return a;
    };
    //System.out.println(myNumber1.someNum(2, -3));
    myMethod.accept(myNumber1.someNum(2, -3));

    iNumber myNumber2 = (i, t) -> i * 10;
    myMethod.accept(myNumber2.someNum(5, 10));

    myMethod.accept("All");
  }
}

interface iNumber {
  int someNum(int i, int t);
}