package com.as.collections.list;

import java.util.*;

/**
 * Created by Andrey Slesarchuk on 11/08/2020.
 */
public class ListRemove {

  public static void removeAll1(List<Integer> list, int element) {
    while (list.contains(element)) {
      list.remove(element);
    }
  }

  public static void removeFor(List<Integer> list, int element) {
    while (list.contains(element)) {
      for (int i = 0; i < list.size(); i++) {
        if (Objects.equals(element, list.get(i))) {
          list.remove(i);
          i--;
        }
      }
    }
  }

  static class Watch {
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
    }
  }

  public static void main(String[] args) {
    Watch watch = new Watch();
    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
    int valueToRemove = 8;

    removeFor(list, valueToRemove);
    System.out.println("First - " + Optional.ofNullable(list.toString()).orElse("nothing"));
    watch.totalTime("Linked List addAll() time = ");

    //list = new ArrayList<>(Arrays.asList(4, 5, 6));
    //removeAll2(list, valueToRemove);
    //System.out.println("Second - " + list.toString());

    //then
    //assertThat(list).isEqualTo(list(2, 3));

  }

}
