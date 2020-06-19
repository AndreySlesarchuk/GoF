package com.as.gof.behavioral.template;
/**
 * Created by Andrey Slesarchuk on 06/19/2020.
 */
abstract class Bevarage {

  public void makeBevarage() {
    boilWater();
    addBevarage();
    addSugar();
    addConditment();
  }

  private void boilWater() {
    System.out.println("boiled water");
  }
  private void addSugar() {
    System.out.println("add sugar");
  }
  abstract void addBevarage();
  abstract void addConditment();

}
