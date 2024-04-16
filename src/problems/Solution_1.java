package problems;

import java.util.HashMap;

public class Solution_1 {
  public int[] twoSum_solution1(int[] nums, int target) {
    int[] indexes = { 0, 0 };
    for (int i = 0; i < nums.length; i++) {
      for (int j = 0; j < nums.length; j++) {
        if (nums[i] + nums[j] == target && i != j) {
          indexes[0] = j;
          indexes[1] = i;
        }
      }
    }
    return indexes;
  }

  public int[] twoSum_solution2(int[] nums, int target) {
    HashMap<Integer, Integer> numMap = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
      int complement = target - nums[i];
      if (numMap.containsKey(complement)) {
        return new int[] { numMap.get(complement), i };
      }
      numMap.put(nums[i], i);
    }
    return new int[0];
  }
}
