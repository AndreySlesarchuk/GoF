package com.as.other.list;

import com.as.other.utils.Watch;
import org.junit.Test;

/**
 * Created by Andrey Slesarchuk on 11/07/2020.
 */
public class ArrayExamples {

  private Watch watch = new Watch();

  @Test public void arrayTwoSum() {
    int[] m1 = new int[] { 3, 2, 4 };
    int t1 = 6;
    int[] m2 = new int[] { -1, 0 };
    int t2 = -1;
    watch.start();
    Solution solution = new Solution();

    watch.totalTime("Result1: " + solution.twoSum1(m1, t1) + " Time: ");
    watch.totalTime("Result2: " + solution.twoSum2(m2, t2) + " Time: ");// 101,16719 Nanoseconds
  }

  class Solution {

    public int[] twoSum2(int[] nums, int target) {
      int l = nums.length - 1;
      if ((nums[0] + nums[1]) == target) {
        return new int[] { 1, 2 };
      }
      for (int i = l; i >= 0; i--) {
        if (target >= nums[i]) {
          for (int j = 0; j < i; j++) {
            if ((nums[i] + nums[j]) == target) {
              return new int[] { i + 1, j + 1 };
            }
          }
        }
      }
      return new int[] { 0, 0 };
    }

    public int[] twoSum1(int[] nums, int target) {
      for (int i = 0; i < nums.length - 1; i++) {
        for (int j = i + 1; j <= nums.length - 1; j++) {
          if ((nums[i] + nums[j]) == target) {
            return new int[] { i, j };
          }
        }
      }
      return new int[] { 0, 0 };
    }

  }

}
