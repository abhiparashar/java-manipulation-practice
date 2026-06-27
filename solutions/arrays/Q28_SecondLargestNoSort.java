// Q28: [3,1,4,1,5,9,2,6] → 2nd largest WITHOUT Arrays.sort()
// Track two variables in a single pass

public class Q28_SecondLargestNoSort {
  public int secondLargest(int[] arr) {
    int largest = Integer.MIN_VALUE;
    int secondLargest = Integer.MIN_VALUE;
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
    Q28_SecondLargestNoSort sol = new Q28_SecondLargestNoSort();
    int[] arr = { 3, 1, 4, 1, 5, 9, 2, 6 };
    System.out.println(sol.secondLargest(arr));
  }
}
