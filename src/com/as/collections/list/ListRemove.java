package com.as.collections.list;

import java.util.*;

import org.junit.Test;

/**
 * Created by Andrey Slesarchuk on 11/08/2020.
 */
public class ListRemove {

  public static void removeAll1(List<Integer> list, int element) {
    while (list.contains(element)) {
      list.remove(element);
    }
  }

  public static void removeAll2(List<Integer> list, int element) {
    while (list.contains(element)) {
      for (int i = 0; i < list.size(); i++) {
        if (Objects.equals(element, list.get(i))) {
          list.remove(i);
          i--;
        }
      }
    }
  }

  public static void main(String[] args) {

    List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
    int valueToRemove = 2;

    removeAll2(list, valueToRemove);
    System.out.println("First - " + Optional.ofNullable(list.toString()).orElse("nothing"));

    //list = new ArrayList<>(Arrays.asList(4, 5, 6));
    //removeAll2(list, valueToRemove);
    //System.out.println("Second - " + list.toString());

    //then
    //assertThat(list).isEqualTo(list(2, 3));

  }

}
