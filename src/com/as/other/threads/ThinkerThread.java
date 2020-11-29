package com.as.other.threads;

import org.apache.log4j.Logger;

/**
 * Created by Andrey Slesarchuk on 10/24/2020.
 */
public class ThinkerThread extends Thread {

  static Logger log = Logger.getLogger(ThinkerThread.class);

  @Override
  public void run() {
    while (!Thread.currentThread().isInterrupted()) {
      Math.cos(Integer.MAX_VALUE);
    }
    Thread.currentThread().interrupt();
    log.info("Второй поток завершён");
  }

  public static void main(String[] args) {
    Thread thread = new ThinkerThread();
    thread.start();
    log.info("Основной поток завершён");
    thread.interrupt();
  }
}