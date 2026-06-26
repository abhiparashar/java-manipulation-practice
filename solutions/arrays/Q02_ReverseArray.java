// Q2: [1,2,3,4,5] → reversed in place → [5,4,3,2,1]

import java.util.Arrays;

public class Q02_ReverseArray {
  public int[] reverseArray(int[] arr) {
    int left = 0;
    int right = arr.length - 1;
    while (left < right) {
      int temp = arr[left];
      arr[left] = arr[right];
      arr[right] = temp;
      left++;
      right--;
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
