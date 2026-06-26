// Q18: [3,1,4,1,5,9,2,6,5,3,5]
// Step 1: Count frequency of each element
// Step 2: Find element with frequency >= 3
// Step 3: Remove ALL occurrences in place → [3,1,4,1,9,2,6,3] (length 8)

import java.util.Arrays;

public class Q18_RemoveFrequent {
  public int[] removeFrequent(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q18_RemoveFrequent sol = new Q18_RemoveFrequent();
    int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
    int[] ans = sol.removeFrequent(arr);
    System.out.println(Arrays.toString(ans));
  }
}
