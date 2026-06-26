// Q12: [3,6,1,8,2,9,4] → element closest to the average → 4
// Average = (3+6+1+8+2+9+4)/7 ≈ 4.71

public class Q12_ClosestToAverage {
  public int closestToAverage(int[] arr) {
    double sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum += arr[i];
    }
    double avg = sum / arr.length;
    double minDiff = Integer.MAX_VALUE;
    int closestElement = arr[0];
    for (int i = 0; i < arr.length; i++) {
      double diff = Math.abs(avg - arr[i]);
      if (diff < minDiff) {
        minDiff = diff;
        closestElement = arr[i];
      }
    }
    return closestElement;
  }

  public static void main(String[] args) {
    Q12_ClosestToAverage sol = new Q12_ClosestToAverage();
    int[] arr = { 3, 6, 1, 8, 2, 9, 4 };
    System.out.println(sol.closestToAverage(arr));
  }
}
