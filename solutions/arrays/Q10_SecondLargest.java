// Q10: [12,5,8,21,3,17,9] → 2nd largest WITHOUT sorting → 17
// Track two variables: largest and secondLargest

public class Q10_SecondLargest {
  public int secondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = -1;
    for (int i = 0; i < arr.length; i++) {
      if (largest < arr[i]) {
        secondLargest = largest;
        largest = arr[i];
      } else if (secondLargest < arr[i]) {
        secondLargest = arr[i];
      }
    }
    return secondLargest;
  }

  public static void main(String[] args) {
    Q10_SecondLargest sol = new Q10_SecondLargest();
    int[] arr = { 12, 5, 8, 21, 3, 17, 9 };
    System.out.println(sol.secondLargest(arr));
  }
}
