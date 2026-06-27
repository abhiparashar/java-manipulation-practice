// Q18: [3,1,4,1,5,9,2,6,5,3,5]
// Step 1: Count frequency of each element
// Step 2: Find element with frequency >= 3
// Step 3: Remove ALL occurrences in place → [3,1,4,1,9,2,6,3] (length 8)

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q18_RemoveFrequent {
  public int[] removeFrequent(int[] arr) {
    // Step 1: count frequency
    Map<Integer, Integer> map = new HashMap<>();
    for (int i = 0; i < arr.length; i++) {
      map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
    }
    // Step 2: find target
    int target = -1;
    for (int i = 0; i < arr.length; i++) {
      if (map.get(arr[i]) >= 3) {
        target = arr[i];
      }
    }

    // remove target
    int[] ans = new int[arr.length - map.get(target)];
    int idx = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] != target) {
        ans[idx] = arr[i];
        idx++;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Q18_RemoveFrequent sol = new Q18_RemoveFrequent();
    int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5 };
    int[] ans = sol.removeFrequent(arr);
    System.out.println(Arrays.toString(ans));
  }
}
