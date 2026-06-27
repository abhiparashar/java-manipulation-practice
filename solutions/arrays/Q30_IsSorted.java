// Q30: [5,2,8,1,9] → check if array is sorted ascending
// Single pass, boolean flag, break early if not sorted

public class Q30_IsSorted {
  public boolean isSorted(int[] arr) {
    boolean ans = false;
    for (int i = 1; i < arr.length; i++) {
      if (arr[i] > arr[i - 1]) {
        ans = true;
      } else {
        return false;
      }
    }
    return ans;
  }

  public static void main(String[] args) {
    Q30_IsSorted sol = new Q30_IsSorted();
    System.out.println(sol.isSorted(new int[] { 1, 2, 3, 4, 5 })); // true
    System.out.println(sol.isSorted(new int[] { 5, 2, 8, 1, 9 })); // false
  }
}
