// Q3: [4,2,7,1,9,3] → max and min in a single pass → 9, 1

public class Q03_MaxMin {
  public int[] maxMin(int[] arr) {
    int max = Integer.MIN_VALUE;
    int min = Integer.MAX_VALUE;
    for (int i = 0; i < arr.length; i++) {
      if (max < arr[i]) {
        max = arr[i];
      }
      if (min > arr[i]) {
        min = arr[i];
      }
    }
    return new int[] { max, min };
  }

  public static void main(String[] args) {
    Q03_MaxMin sol = new Q03_MaxMin();
    int[] arr = { 4, 2, 7, 1, 9, 3 };
    int[] ans = sol.maxMin(arr);
    System.out.println("Max: " + ans[0] + ", Min: " + ans[1]);
  }
}
