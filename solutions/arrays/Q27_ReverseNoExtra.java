// Q27: [1,2,3,4,5] → reverse WITHOUT Collections.reverse() or extra array
// Use two-pointer swap from both ends

import java.util.Arrays;

public class Q27_ReverseNoExtra {
  public int[] reverse(int[] arr) {
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
    Q27_ReverseNoExtra sol = new Q27_ReverseNoExtra();
    int[] arr = { 1, 2, 3, 4, 5 };
    System.out.println(Arrays.toString(sol.reverse(arr)));
  }
}
