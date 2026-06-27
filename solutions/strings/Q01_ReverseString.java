// Q1: "hello" → reversed → "olleh"
// Practice all 3 ways: StringBuilder, char array swap, recursion

public class Q01_ReverseString {
  // Way 1: StringBuilder
  public String reverseStringBuilder(String s) {
    return new StringBuilder(s).reverse().toString();
  }

  // Way 2: char array swap
  public String reverseCharArray(String str) {
    char[] strArr = str.toCharArray();
    int left = 0;
    int right = strArr.length - 1;
    while (left < right) {
      char temp = strArr[left];
      strArr[left] = strArr[right];
      strArr[right] = temp;
      left++;
      right--;
    }
    return new String(strArr);
  }

  // Way 3: recursion
  public String reverseRecursion(String str) {
    if (str.length() <= 1) return str;
    return reverseRecursion(str.substring(1)) + str.charAt(0);
  }

  public static void main(String[] args) {
    Q01_ReverseString sol = new Q01_ReverseString();
    System.out.println(sol.reverseStringBuilder("hello"));
    System.out.println(sol.reverseCharArray("hello"));
    System.out.println(sol.reverseRecursion("hello"));
  }
}
