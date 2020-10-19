package com.as.expressions.lambda;
/**
 * Created by Slesarchuk on 10/19/2020.
 */
public class MyNumber {
  public static void main(String[] args) {
    ExpNumber myNumber1 = (i, t) -> {
      int a;
      if (i < t)
        a = i;
      else
        a = t;
      return a;
    };
    System.out.println(myNumber1.someNum(2, -3));
    ExpNumber myNumber2 = (i, t) -> i * 10;
    System.out.println(myNumber2.someNum(2, 7));
  }
}

interface ExpNumber {
  int someNum(int i, int t);
}