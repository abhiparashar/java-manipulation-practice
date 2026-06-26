// Q2: [1,2,3,4,5] → reversed in place → [5,4,3,2,1]

import java.util.Arrays;

public class Q02_ReverseArray {
  public int[] reverseArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      
    }
    return arr;
  }

  public static void main(String[] args) {
    Q02_ReverseArray sol = new Q02_ReverseArray();
    int[] arr = { 1, 2, 3, 4, 5 };
    int[] ans = sol.reverseArray(arr);
    System.out.println(Arrays.toString(ans));
  }
}
