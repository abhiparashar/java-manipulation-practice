// Q19: [5,2,9,1,5,6,7,3,2,4]
// Step 1: Find 3rd smallest WITHOUT full sort
// Step 2: Count elements strictly greater than it → 7

public class Q19_ThirdSmallest {
  public int[] thirdSmallest(int[] arr) {
    // YOUR SOLUTION HERE
    // return new int[]{thirdSmallest, countGreater}
    return new int[]{};
  }

  public static void main(String[] args) {
    Q19_ThirdSmallest sol = new Q19_ThirdSmallest();
    int[] arr = { 5, 2, 9, 1, 5, 6, 7, 3, 2, 4 };
    int[] ans = sol.thirdSmallest(arr);
    System.out.println("3rd smallest: " + ans[0] + ", Count greater: " + ans[1]);
  }
}
