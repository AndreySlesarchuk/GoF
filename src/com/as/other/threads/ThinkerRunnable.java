package com.as.other.threads;

import org.apache.log4j.Logger;

import java.util.concurrent.TimeUnit;

/**
 * Created by Andrey Slesarchuk on 10/24/2020.
 */
public class ThinkerRunnable implements Runnable {

  static Logger log = Logger.getLogger(ThinkerRunnable.class);

  @Override
  public void run() {
    try {
      TimeUnit.SECONDS.sleep(3);
      log.info("Второй поток завершён");
    }
    catch (InterruptedException e) {
      Thread.currentThread().interrupt();
    }
  }

  public static void main(String[] args) {
    new Thread(new ThinkerRunnable()).start();
    log.info("Основной поток завершён");
  }
}