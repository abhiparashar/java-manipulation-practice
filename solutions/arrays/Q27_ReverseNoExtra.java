// Q27: [1,2,3,4,5] → reverse WITHOUT Collections.reverse() or extra array
// Use two-pointer swap from both ends

import java.util.Arrays;

public class Q27_ReverseNoExtra {
  public int[] reverse(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q27_ReverseNoExtra sol = new Q27_ReverseNoExtra();
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(sol.reverse(arr)));
  }
}
