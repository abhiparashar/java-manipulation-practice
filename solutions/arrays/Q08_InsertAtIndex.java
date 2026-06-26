// Q8: [1,2,3,0] (last slot empty), insert 99 at index 1, shift right → [1,99,2,3]

import java.util.Arrays;

public class Q08_InsertAtIndex {
  public int[] insertAtIndex(int[] arr, int index, int value) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q08_InsertAtIndex sol = new Q08_InsertAtIndex();
    int[] arr = { 1, 2, 3, 0 };
    System.out.println(Arrays.toString(sol.insertAtIndex(arr, 1, 99)));
  }
}
