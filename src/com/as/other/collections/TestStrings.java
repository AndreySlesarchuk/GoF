package com.as.other.collections;

public class TestStrings {

  public static void main(String[] args) {
    TestStrings ts = new TestStrings();
    String states = "Германия  Франция    Италия    Испания";
    String res = ts.removeSpaces(states);
    System.out.println(res);

    String[] arrayList = new String[] {"Германия", "Франция", "Италия", "Испания"};
    StringBuilder line = new StringBuilder();
    String splitter = "#";
    for(int i = 0; i < arrayList.length; i++) {
      line.append(arrayList[i]);
      line.append(splitter);
    }
    String resultStr = line.toString();
    String[] resultArr = resultStr.split(splitter);
    System.out.println(resultStr);
    System.out.println(resultArr);

    String doubleString = "1348.0";
    String integerString = doubleString.substring(0, doubleString.length() - 2);
    System.out.println("Integer number is: " + integerString);

    Double d = Double.valueOf(doubleString);
    int i = d.intValue();
    System.out.println("Integer from double: " + i);

  }

  private String removeSpaces(String str) {
    if (str.indexOf("  ") != -1) {
      return removeSpaces(str.replace("  ", " "));
    }
    return str;
  }

}
