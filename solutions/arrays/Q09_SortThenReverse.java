// Q9: [5,1,4,2,8] → sort ascending, then reverse → [8,5,4,2,1]
// Do both steps explicitly — no descending sort shortcut

import java.util.Arrays;

public class Q09_SortThenReverse {
  public int[] sortThenReverse(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q09_SortThenReverse sol = new Q09_SortThenReverse();
    int[] arr = { 5, 1, 4, 2, 8 };
    System.out.println(Arrays.toString(sol.sortThenReverse(arr)));
  }
}
