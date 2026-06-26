// Q24: [1,2,1,3,2,1,4,2], window size=3
// For each window of size 3, find most frequent element
// Tie-breaking rule: return first element with max frequency
// → [1, tie, tie, tie, tie, tie]

import java.util.Arrays;

public class Q24_SlidingWindowFrequency {
  public int[] slidingWindowFrequency(int[] arr, int k) {
    // YOUR SOLUTION HERE
    return new int[]{};
  }

  public static void main(String[] args) {
    Q24_SlidingWindowFrequency sol = new Q24_SlidingWindowFrequency();
    int[] arr = { 1, 2, 1, 3, 2, 1, 4, 2 };
    System.out.println(Arrays.toString(sol.slidingWindowFrequency(arr, 3)));
  }
}
