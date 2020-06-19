package com.as.gof.behavioral.template;
/**
 * Created by Andrey Slesarchuk on 06/19/2020.
 */
public class Coffee extends Bevarage {

  @Override void addBevarage() {
    System.out.println("add coffee");
  }

  @Override void addConditment() {
    System.out.println("add milk");
  }

  @Override void startHook() {
    System.out.println("wash the cup");
  }

  @Override void endHook() {
    System.out.println("bill");
  }
}
