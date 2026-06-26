// Q5: [3,7,2,9,4,1] → count of elements greater than 4 → 2

public class Q05_CountGreaterThan4 {
  public int countGreater(int[] arr) {
    int k = 4;
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
      if (arr[i] > k) {
        count++;
      }
    }
    return count;
  }

  public static void main(String[] args) {
    Q05_CountGreaterThan4 sol = new Q05_CountGreaterThan4();
    int[] arr = { 3, 7, 2, 9, 4, 1 };
    System.out.println(sol.countGreater(arr));
  }
}
