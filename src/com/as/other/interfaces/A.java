package com.as.other.interfaces;

public interface A {
  default void foo() {
    System.out.println("Foo A");
  }
}
