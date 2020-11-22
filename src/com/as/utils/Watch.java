package com.as.utils;

public class Watch {
    private long startTime;
    private long endTime;
    public void start() {
      startTime = System.nanoTime();
    }
    private void stop() {
      endTime = System.nanoTime();
    }
    public void totalTime(String s) {
      stop();
      System.out.println(s + (endTime - startTime));
      System.out.println(s + ((endTime - startTime)/1000000));//Milliseconds
    }
  }
}
