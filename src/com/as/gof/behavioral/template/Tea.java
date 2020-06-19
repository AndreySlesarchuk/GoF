package com.as.gof.behavioral.template;
/**
 * Created by Andrey Slesarchuk on 06/19/2020.
 */
public class Tea extends Bevarage {
  @Override void addBevarage() {
    System.out.println("add tea");
  }

  @Override void addConditment() {
    System.out.println("add lemon");
  }
}
