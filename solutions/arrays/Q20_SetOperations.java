// Q20: arr1=[1,3,5,7,9], arr2=[2,3,6,7,10]
// Step 1: Common elements (intersection) → [3,7]
// Step 2: Unique to arr1 only → [1,5,9]
// Step 3: Unique to arr2 only → [2,6,10]

import java.util.Arrays;

public class Q20_SetOperations {
  public int[][] setOperations(int[] arr1, int[] arr2) {
    // YOUR SOLUTION HERE
    // return new int[][]{common, uniqueArr1, uniqueArr2}
    return new int[][]{};
  }

  public static void main(String[] args) {
    Q20_SetOperations sol = new Q20_SetOperations();
    int[] arr1 = { 1, 3, 5, 7, 9 };
    int[] arr2 = { 2, 3, 6, 7, 10 };
    int[][] ans = sol.setOperations(arr1, arr2);
    System.out.println("Common:       " + Arrays.toString(ans[0]));
    System.out.println("Unique arr1:  " + Arrays.toString(ans[1]));
    System.out.println("Unique arr2:  " + Arrays.toString(ans[2]));
  }
}
