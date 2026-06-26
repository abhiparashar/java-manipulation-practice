// Q11: [1,2,3,4,5,6,7,8,9] → split into two halves (odd length: middle goes to first)
// → [1,2,3,4,5] and [6,7,8,9]

import java.util.Arrays;

public class Q11_SplitArray {
  public int[][] splitArray(int[] arr) {
    // YOUR SOLUTION HERE
    return new int[][]{};
  }

  public static void main(String[] args) {
    Q11_SplitArray sol = new Q11_SplitArray();
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
    int[][] ans = sol.splitArray(arr);
    System.out.println("First half:  " + Arrays.toString(ans[0]));
    System.out.println("Second half: " + Arrays.toString(ans[1]));
  }
}
