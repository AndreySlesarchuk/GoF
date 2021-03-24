package com.as.other.utils;

/**
 * Created by Andrey Slesarchuk on 03/24/2021.
 */
public class MyDateFormat {

  public String getDateString(String inputString) {
    String[] values = inputString.split(".");
    if (values.length < 3) {
      values = inputString.split("/");
      if (values.length == 3) {
        return values[1] + "." + values[0] + "." + values[2];
      }
      else {
        return "";
      }
    }
    else {
      return values[0] + "." + values[1] + "." + values[2];
    }
  }

}
