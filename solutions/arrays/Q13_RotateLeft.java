// Q13: [1,2,3,4,5], k=2 → rotate LEFT by k positions → [3,4,5,1,2]
// Use reversal trick: reverse first k, reverse rest, reverse whole

import java.util.Arrays;

public class Q13_RotateLeft {
  public int[] rotateLeft(int[] arr, int k) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q13_RotateLeft sol = new Q13_RotateLeft();
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(sol.rotateLeft(arr, 2)));
  }
}
