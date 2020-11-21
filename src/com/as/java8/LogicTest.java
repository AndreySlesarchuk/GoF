package com.as.java8;

/**
 * Created by Andrey Slesarchuk on 11/21/2020.
 */
public class LogicTest {

  public LogicTest() {
  }

  public static void main(String[] args) {
    boolean password = false;
    boolean isEmailExpired = true;
    boolean hasEmailAmount = true;
    LogicTest lt = new LogicTest();
    System.out.println(lt.testEmailSending(password, isEmailExpired, hasEmailAmount));
  }

  private String testEmailSending(boolean password, boolean isEmailExpired, boolean hasEmailAmount) {
    // when email with password - message will be sent always
    if (!password && (isEmailExpired || !hasEmailAmount)) {
      return "Email expired or ran out of balance";
    }
    else {
      return "Email will be sent";
    }
  }

}
