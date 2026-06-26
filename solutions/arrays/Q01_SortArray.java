// Q1: [5,3,8,1,9,2] → sort ascending → [1,2,3,5,8,9]

import java.util.Arrays;

public class Q01_SortArray {
  public int[] sortedArray(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          arr[i] = arr[i] ^ arr[j];
          arr[j] = arr[i] ^ arr[j];
          arr[i] = arr[i] ^ arr[j];
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    Q01_SortArray sol = new Q01_SortArray();
    int[] arr = { 5, 3, 8, 1, 9, 2 };
    int[] ans = sol.sortedArray(arr);
    System.out.println(Arrays.toString(ans));
  }
}
