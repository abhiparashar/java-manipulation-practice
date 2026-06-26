// Q3: [4,2,7,1,9,3] → max and min in a single pass → 9, 1

public class Q03_MaxMin {
  public int[] maxMin(int[] arr) {
    // YOUR SOLUTION HERE
    // return new int[]{max, min}
    return new int[]{};
  }

  public static void main(String[] args) {
    Q03_MaxMin sol = new Q03_MaxMin();
    int[] arr = { 4, 2, 7, 1, 9, 3 };
    int[] ans = sol.maxMin(arr);
    System.out.println("Max: " + ans[0] + ", Min: " + ans[1]);
  }
}
