package com.as.gof.behavioral.template;
/**
 * Created by Andrey Slesarchuk on 06/19/2020.
 */
abstract class Bevarage {

  public void makeBevarage() {
    startHook();
    boilWater();
    addBevarage();
    addSugar();
    addConditment();
    endHook();
  }

  void startHook() {}
  void endHook() {}

  private void boilWater() {
    System.out.println("boiled water");
  }
  private void addSugar() {
    System.out.println("add sugar");
  }
  abstract void addBevarage();
  abstract void addConditment();

}
