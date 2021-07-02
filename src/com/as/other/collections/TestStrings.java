package com.as.other.collections;

import java.util.ArrayList;

public class TestStrings {

  public static void main(String[] args) {
    TestStrings ts = new TestStrings();
    String states = "Германия  Франция    Италия    Испания";
    String res = ts.removeSpaces(states);
    System.out.println(res);
  }

  private String removeSpaces(String str) {
    if (str.indexOf("  ") != -1) {
      return removeSpaces(str.replace("  ", " "));
    }
    return str;
  }

}
