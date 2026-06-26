// Q6: [1,0,1,0,1,1,0] → count of 1s and 0s → 4, 3

public class Q06_CountOnesZeros {
  public int[] countOnesZeros(int[] arr) {
    // YOUR SOLUTION HERE
    // return new int[]{ones, zeros}
    return new int[]{};
  }

  public static void main(String[] args) {
    Q06_CountOnesZeros sol = new Q06_CountOnesZeros();
    int[] arr = { 1, 0, 1, 0, 1, 1, 0 };
    int[] ans = sol.countOnesZeros(arr);
    System.out.println("1s: " + ans[0] + ", 0s: " + ans[1]);
  }
}
