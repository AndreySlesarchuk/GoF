package com.as.java8;

/**
 * Created by Andrey Slesarchuk on 11/21/2020.
 */
public class logicTest {

  public static void main(String[] args) {
    // when email with password - message will be sent always
    boolean password = false;
    boolean isEmailExpired = false;
    boolean hasEmailAmount = true;

    if (!password && (isEmailExpired || !hasEmailAmount)) {
      System.out.println("Email expired or ran out of balance");
    }
    else {
      System.out.println("Email with password will be sent");
    }
  }

}
