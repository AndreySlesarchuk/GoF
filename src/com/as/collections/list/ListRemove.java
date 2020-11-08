package com.as.collections.list;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

/**
 * Created by Andrey Slesarchuk on 11/08/2020.
 */
public class ListRemove {

  @Test
  public static void removeAll1(List<Integer> list, int element) {
    while (list.contains(element)) {
      list.remove(element);
    }
  }

  public static void main(String[] args) {
    //given
    List<Integer> list = Arrays.asList(1, 2, 3);
    int valueToRemove = 1;
    //when
    removeAll1(list, valueToRemove);
    //then
    //assertThat(list).isEqualTo(list(2, 3));

  }

}
