// Q21: "abcdefcba"
// Step 1: Compare each char with its mirror position
// Step 2: Count mismatches
// Step 3: Almost palindrome if mismatches <= 1 → true

public class Q21_AlmostPalindrome {
  public boolean isAlmostPalindrome(String s) {
    // YOUR SOLUTION HERE
    return false;
  }

  public static void main(String[] args) {
    Q21_AlmostPalindrome sol = new Q21_AlmostPalindrome();
    System.out.println(sol.isAlmostPalindrome("abcdefcba")); // true
  }
}
