package com.as.java8;

import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Consumer;

/**
 * Created by Andrey Slesarchuk on 11/01/2020.
 */
public class MyNumbers {

  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    numbers.add(2);
    numbers.add(7);
    numbers.add(9);
    numbers.add(1);
    MyNumbers myNumbers = new MyNumbers();
    System.out.println(myNumbers.joinNumbers(numbers));
  }

  public String joinNumbers(Collection<? extends Integer> numbers) {
    StringBuilder result = new StringBuilder();
    boolean first = true;
    for (Integer number : numbers) {
      if (first)
        first = false;
      else
        result.append(", ");
      result.append(number);
    }
    return result.toString();
  }

}
