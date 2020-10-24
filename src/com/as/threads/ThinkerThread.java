package com.as.threads;

import java.util.concurrent.TimeUnit;
/**
 * Created by Andrey Slesarchuk on 10/24/2020.
 */
public class ThinkerThread extends Thread {

  @Override
  public void run() {
    try {
      TimeUnit.SECONDS.sleep(3); // аналогично Thread.sleep(3000L);
      System.out.println("Второй поток завершён");
    } catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  public static void main(String[] args) {
    new ThinkerThread().start();
    System.out.println("Основной поток завершён");
  }
}