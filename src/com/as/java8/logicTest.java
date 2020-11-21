package com.as.java8;

/**
 * Created by Andrey Slesarchuk on 11/21/2020.
 */
public class logicTest {

  public static void main(String[] args) {

    boolean isEmailExpired = true;
    boolean password = true;
    boolean hasEmailAmount = true;

    if ((isEmailExpired && !password) || (!hasEmailAmount)) {
      System.out.println("Email expired or ran out of balance");
    }
    else {
      System.out.println("Email with password will be sent");
    }
  }

}
