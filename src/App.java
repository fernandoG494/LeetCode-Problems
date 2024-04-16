import java.util.Arrays;

import problems.Solution_1;

public class App {
  public static void main(String[] args) throws Exception {
    Solution_1 solution = new Solution_1();

    int[] s1 = solution.twoSum_solution1(new int[] { 2, 7, 11, 15 }, 9);
    System.out.println(Arrays.toString(s1));

    int[] s2 = solution.twoSum_solution2(new int[] { 2, 7, 11, 15 }, 9);
    System.out.println(Arrays.toString(s2));
  }
}
