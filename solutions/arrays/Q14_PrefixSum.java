// Q14: [2,4,6,8,10,12] → replace each element with running sum (in place)
// → [2,6,12,20,30,42]

import java.util.Arrays;

public class Q14_PrefixSum {
  public int[] prefixSum(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q14_PrefixSum sol = new Q14_PrefixSum();
    int[] arr = { 2, 4, 6, 8, 10, 12 };
    System.out.println(Arrays.toString(sol.prefixSum(arr)));
  }
}
