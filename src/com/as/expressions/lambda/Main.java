package com.as.expressions.lambda;

public class Main {
  public static void main(String[] args) {
    MyNumber myNumber1 = (i) -> i*5;
    System.out.println(myNumber1.someNum(2));
    MyNumber myNumber2 = (i) -> i*10;
    System.out.println(myNumber2.someNum(2));
  }
}

interface  MyNumber {
  int someNum(int i);
}