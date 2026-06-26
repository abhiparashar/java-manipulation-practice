// Q25: [5,7,2,9,4,1,8,3,6]
// Step 1: Find average → 5
// Step 2: Rearrange so elements < avg come first, then >= avg
// → [2,4,1,3,5,7,9,8,6]

import java.util.Arrays;

public class Q25_RearrangeAroundAverage {
  public int[] rearrange(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q25_RearrangeAroundAverage sol = new Q25_RearrangeAroundAverage();
    int[] arr = { 5, 7, 2, 9, 4, 1, 8, 3, 6 };
    System.out.println(Arrays.toString(sol.rearrange(arr)));
  }
}
