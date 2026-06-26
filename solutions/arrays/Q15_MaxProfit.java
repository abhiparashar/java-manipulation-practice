// Q15: [7,1,5,3,6,4] → max difference arr[j]-arr[i] where j>i → 5
// Single pass, track min so far (buy at 1, sell at 6)

public class Q15_MaxProfit {
  // public int maxProfit(int[] arr) {
  // int maxDiff = Integer.MIN_VALUE;
  // for (int i = 0; i < arr.length; i++) {
  // for (int j = i + 1; j < arr.length; j++) {
  // if (arr[j] > arr[i]) {
  // if (maxDiff < arr[j] - arr[i]) {
  // maxDiff = arr[j] - arr[i];
  // }
  // }
  // }
  // }
  // return maxDiff;
  // }

  public int maxProfitOptimized(int[] arr) {
    int minSofar = Integer.MAX_VALUE;
    int maxProfit = 0;
    for (int i = 0; i < arr.length; i++) {
      if (minSofar > arr[i]) { //1
        minSofar = arr[i];
      }
      maxProfit = Math.max(maxProfit, arr[i] - minSofar);
      System.out.println(maxProfit);
    }
    return maxProfit;
  }

  public static void main(String[] args) {
    Q15_MaxProfit sol = new Q15_MaxProfit();
    int[] arr = { 7, 1, 5, 3, 6, 4 };
    System.out.println(sol.maxProfitOptimized(arr));
  }
}
