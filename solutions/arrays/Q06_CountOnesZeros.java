// Q6: [1,0,1,0,1,1,0] → count of 1s and 0s → 4, 3

public class Q06_CountOnesZeros {
  public int[] countOnesZeros(int[] arr) {
    int ones = 0;
    int zeros = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] == 1) {
        ones++;
      } else if (arr[i] == 0) {
        zeros++;
      }
    }
    // return new int[]{ones, zeros}
    return new int[] { ones, zeros };
  }

  public static void main(String[] args) {
    Q06_CountOnesZeros sol = new Q06_CountOnesZeros();
    int[] arr = { 1, 0, 1, 0, 1, 1, 0 };
    int[] ans = sol.countOnesZeros(arr);
    System.out.println("1s: " + ans[0] + ", 0s: " + ans[1]);
  }
}
