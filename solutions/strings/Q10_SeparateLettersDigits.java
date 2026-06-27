// Q10: "Hello123World456" → separate letters and digits → "HelloWorld", "123456"

public class Q10_SeparateLettersDigits {
  public String[] separate(String s) {
    // YOUR SOLUTION HERE
    // return new String[]{letters, digits}
    return new String[]{"", ""};
  }

  public static void main(String[] args) {
    Q10_SeparateLettersDigits sol = new Q10_SeparateLettersDigits();
    String[] ans = sol.separate("Hello123World456");
    System.out.println("Letters: " + ans[0]);
    System.out.println("Digits:  " + ans[1]);
  }
}
