// Q7: [10,20,30,40,50], index=2 → remove element, shift left, last=0 → [10,20,40,50,0]

import java.util.Arrays;

public class Q07_RemoveAtIndex {
  public int[] removeAtIndex(int[] arr, int index) {
    int[] nums = new int[arr.length];
    for (int i = 0; i < index; i++) {
      nums[i] = arr[i];
    }
    for (int i = index + 1; i < arr.length; i++) {
      nums[i - 1] = arr[i];
    }
    return nums;
  }

  public static void main(String[] args) {
    Q07_RemoveAtIndex sol = new Q07_RemoveAtIndex();
    int[] arr = { 10, 20, 30, 40, 50 };
    System.out.println(Arrays.toString(sol.removeAtIndex(arr, 2)));
  }
}
