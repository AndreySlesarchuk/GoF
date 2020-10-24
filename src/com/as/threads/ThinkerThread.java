package com.as.threads;

/**
 * Created by Andrey Slesarchuk on 10/24/2020.
 */
public class ThinkerThread extends Thread {

  @Override
  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      Math.cos(Integer.MAX_VALUE);
    }
    Thread.currentThread().interrupt();
    System.out.println("Второй поток завершён");
  }

  public static void main(String[] args) {
    Thread thread = new ThinkerThread();
    thread.start();
    System.out.println("Основной поток завершён");
    thread.interrupt();
  }
}