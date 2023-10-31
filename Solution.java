import java.util.HashMap;

class Solution {
  public static void main(String[] args) {
    // Try out your test cases:
    System.out.println(Solution.mostFrequentChar("bookeeper")); // -> 'e'
    System.out.println(Solution.mostFrequentChar("eleventennine")); // -> 'e'
    System.out.println(Solution.mostFrequentChar("mississippi")); // -> 'i'
    System.out.println(Solution.mostFrequentChar("david")); // -> 'd'

  }

  public static char mostFrequentChar(String word) {
    HashMap<Character, Integer> wordMap = new HashMap<>();
    char mostFrequent = 0;
    int count = 0;
    for (int i = 0; i < word.length(); i++) {
      char test = word.charAt(i);
      wordMap.put(test, wordMap.getOrDefault(test, 0) + 1);

      if (count <= wordMap.get(test)) {
        mostFrequent = test;
        count = wordMap.get(test);
      }
    }

    return mostFrequent;
  }

}
