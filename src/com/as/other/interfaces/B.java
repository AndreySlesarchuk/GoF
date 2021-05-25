package com.as.other.interfaces;

public interface B {
  default void foo() {
    System.out.println("Foo B");
  }
}
