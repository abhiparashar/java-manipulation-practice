// Q25: "abcdef", "defabc"
// Step 1: Check if string2 is a rotation of string1 (manual, no contains shortcut)
// Step 2: Find the rotation offset → true, offset = 3

public class Q25_StringRotation {
  public void checkRotation(String s1, String s2) {
    // YOUR SOLUTION HERE
    // print: is rotation (true/false) and offset
  }

  public static void main(String[] args) {
    Q25_StringRotation sol = new Q25_StringRotation();
    sol.checkRotation("abcdef", "defabc");
  }
}
