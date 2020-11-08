package com.as.collections.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

import org.junit.Test;

/**
 * Created by Andrey Slesarchuk on 11/08/2020.
 */
public class ListRemove {

  public void removeAll1(List<Integer> list, int element) {
    while (list.contains(element)) {
      list.remove(element);
    }
  }

  public static void removeAll2(List<Integer> list, int element) {
    while (list.contains(element)) {
      list.remove(element);
    }
  }

  public static void main(String[] args) {
    List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 3));
    int valueToRemove = 1;
    for (int i = 0; i < list.size(); i++) {
      if (Objects.equals(valueToRemove, list.get(i))) {
        list.remove(i);
        i--;
      }
    }
    //given
    //List<Integer> list = Arrays.asList(1, 2, 3);
    //int valueToRemove = 1;

    //list.remove(valueToRemove);

    //when
    //removeAll2(list, valueToRemove);
    System.out.println(list.toString());
    //then
    //assertThat(list).isEqualTo(list(2, 3));

  }

}
