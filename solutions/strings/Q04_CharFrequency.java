// Q4: "programming" → character frequency map → {p:1,r:2,o:1,g:2,a:1,m:2,i:1,n:1}

import java.util.HashMap;
import java.util.Map;

public class Q04_CharFrequency {
  public Map<Character, Integer> charFrequency(String s) {
    // YOUR SOLUTION HERE
    return new HashMap<>();
  }

  public static void main(String[] args) {
    Q04_CharFrequency sol = new Q04_CharFrequency();
    System.out.println(sol.charFrequency("programming"));
  }
}
