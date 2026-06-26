// Q16: [4,2,2,8,3,3,1]
// Step 1: Remove duplicates (keep first occurrence order)
// Step 2: Sort descending
// Step 3: Return sum of top 2 elements → 12

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Q16_UniqueTopTwoSum {

  public int uniqueTopTwoSum(int[] arr) {
    // unique
    Set<Integer> set = new HashSet<>();
    for (int num : arr) {
      set.add(num);
    }
    // sort
    List<Integer> list = new ArrayList<>(set);
    for (int i = 0; i < list.size(); i++) {
      for (int j = i + 1; j < list.size(); j++) {
        if (list.get(i) > list.get(j)) {
          int temp = list.get(i);
          list.set(i, list.get(j));
          list.set(j, temp);
        }
      }
    }
    // reverse
    int left = 0;
    int right = list.size() - 1;
    while (left < right) {
      int temp = list.get(right);
      list.set(right, list.get(left));
      list.set(left, temp);
      left++;
      right--;
    }
    int sum = 0;
    for (int i = 0; i < 2; i++) {
      sum += list.get(i);
    }
    return sum;
  }

  public static void main(String[] args) {
    Q16_UniqueTopTwoSum sol = new Q16_UniqueTopTwoSum();
    int[] arr = { 4, 2, 2, 8, 3, 3, 1 };
    System.out.println(sol.uniqueTopTwoSum(arr));
  }
}
