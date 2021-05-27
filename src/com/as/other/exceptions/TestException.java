package com.as.other.exceptions;

public class TestException {

  public static Double divide(int i1, int i2) throws Exception {
    if (i2 != 0)
      return new Double (i2 / i2);
    else {
      Throwable e = new Exception();
      throw e;   // Unhandled exception type Throwable
    }
  }
  public static void main(String[] args) {
    Object obj = "Hello!";
    char   c   = obj.charAt(0); // The method charAt(int) is
    // undefined for the type Object
  }
}
