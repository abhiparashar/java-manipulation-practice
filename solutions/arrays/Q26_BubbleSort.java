// Q26: [9,3,7,1,5] → sort ascending using BUBBLE SORT (manual, no Arrays.sort)

import java.util.Arrays;

public class Q26_BubbleSort {
  public int[] bubbleSort(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      for (int j = i + 1; j < arr.length; j++) {
        if (arr[i] > arr[j]) {
          int temp = arr[i];
          arr[i] = arr[j];
          arr[j] = temp;
        }
      }
    }
    return arr;
  }

  public static void main(String[] args) {
    Q26_BubbleSort sol = new Q26_BubbleSort();
    int[] arr = { 9, 3, 7, 1, 5 };
    System.out.println(Arrays.toString(sol.bubbleSort(arr)));
  }
}
