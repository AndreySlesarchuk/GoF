package com.as.expressions.lambda;

public class MyNumber {
  public static void main(String[] args) {
    ExpNumber myNumber1 = (i) -> i * 5;
    System.out.println(myNumber1.someNum(2));
    ExpNumber myNumber2 = (i) -> i * 10;
    System.out.println(myNumber2.someNum(2));
  }
}

interface  ExpNumber {
  int someNum(int i);
}