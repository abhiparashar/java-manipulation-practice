import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q24_SlidingWindowFrequency {
  public int[] slidingWindowFrequency(int[] arr, int k) {
    int[] result = new int[arr.length - k + 1];

    for (int i = 0; i <= arr.length - k; i++) {
      // count frequency of current window
      Map<Integer, Integer> map = new HashMap<>();
      for (int j = i; j < i + k; j++) {
        map.put(arr[j], map.getOrDefault(arr[j], 0) + 1);
      }

      // find element with max frequency (tie: first element wins)
      int maxCount = 0;
      int maxElem = arr[i];
      for (int j = i; j < i + k; j++) {
        if (map.get(arr[j]) > maxCount) {
          maxCount = map.get(arr[j]);
          maxElem = arr[j];
        }
      }

      result[i] = maxElem;
    }

    return result;
  }

  public static void main(String[] args) {
    Q24_SlidingWindowFrequency sol = new Q24_SlidingWindowFrequency();
    int[] arr = { 1, 2, 1, 3, 2, 1, 4, 2 };
    System.out.println(Arrays.toString(sol.slidingWindowFrequency(arr, 3)));
  }
}