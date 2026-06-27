// Q9: "listen", "silent" → are they anagrams? → true

public class Q09_Anagram {
  public boolean isAnagram(String s1, String s2) {
    // YOUR SOLUTION HERE
    return false;
  }

  public static void main(String[] args) {
    Q09_Anagram sol = new Q09_Anagram();
    System.out.println(sol.isAnagram("listen", "silent")); // true
    System.out.println(sol.isAnagram("hello", "world"));   // false
  }
}
