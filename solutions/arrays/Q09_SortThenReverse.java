// Q9: [5,1,4,2,8] → sort ascending, then reverse → [8,5,4,2,1]
// Do both steps explicitly — no descending sort shortcut

import java.util.Arrays;

public class Q09_SortThenReverse {
  public int[] sortThenReverse(int[] arr) {
    // sort first
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }

    // reverse
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
    Q09_SortThenReverse sol = new Q09_SortThenReverse();
    int[] arr = { 5, 1, 4, 2, 8 };
    System.out.println(Arrays.toString(sol.sortThenReverse(arr)));
  }
}
