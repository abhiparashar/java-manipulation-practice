// Q23: [10,20,30,40,50,60,70,80,90]
// Step 1: Reverse in place → [90,80,70,60,50,40,30,20,10]
// Step 2: Remove every 3rd element (1-indexed: positions 3,6,9)
// → [90,80,60,50,30,20]

import java.util.Arrays;

public class Q23_ReverseRemoveThird {
  public int[] reverseRemoveThird(int[] arr) {
    // YOUR SOLUTION HERE
    return arr;
  }

  public static void main(String[] args) {
    Q23_ReverseRemoveThird sol = new Q23_ReverseRemoveThird();
    int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
    System.out.println(Arrays.toString(sol.reverseRemoveThird(arr)));
  }
}
