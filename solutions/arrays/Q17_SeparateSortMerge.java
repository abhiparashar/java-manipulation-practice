// Q17: [1,-2,3,-4,5,-6,7,-8]
// Step 1: Separate into positives and negatives
// Step 2: Sort positives ascending, negatives descending
// Step 3: Merge alternately → [1,-2,3,-4,5,-6,7,-8]

import java.util.Arrays;

public class Q17_SeparateSortMerge {
  public int[] separateSortMerge(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q17_SeparateSortMerge sol = new Q17_SeparateSortMerge();
    int[] arr = { 1, -2, 3, -4, 5, -6, 7, -8 };
    System.out.println(Arrays.toString(sol.separateSortMerge(arr)));
  }
}
