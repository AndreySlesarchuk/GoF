package com.as.java8;

import java.util.function.Function;

/**
 * Created by Andrey Slesarchuk on 10/28/2020.
 */
public class Java2Function {
  public static void main(String[] args) {

    Function<String, Integer> func = x -> x.length();

    Function<Integer, Integer> func2 = x -> x * 2;

    Integer result = func.andThen(func2).apply("andrey");   // 6

    System.out.println(result);

  }
}
