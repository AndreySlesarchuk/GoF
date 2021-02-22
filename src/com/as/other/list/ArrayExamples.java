package com.as.other.list;

import com.as.other.utils.Watch;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Andrey Slesarchuk on 11/07/2020.
 */
public class ArrayExamples {

  private Watch watch = new Watch();

  @Test
  public void arrayTwoSum() {
    int[] myArray = new int[] {3, 2, 4};
    int target = 6;
    watch.start();
    Solution solution = new Solution();

    watch.totalTime("Result: "+ solution.twoSum(myArray,target) + " Time: ");// 101,16719 Nanoseconds
  }

  class Solution {

    public int[] twoSum(int[] nums, int target) {
      for (int i=0; i < nums.length-2; i++) {
        for(int j=i+1; j <= nums.length-1; j++) {
          if((nums[i]+nums[j]) == target) {
            return new int[] {i,j};
          }
        }
      }
      return new int[]{0,0};
    }

  }

}
