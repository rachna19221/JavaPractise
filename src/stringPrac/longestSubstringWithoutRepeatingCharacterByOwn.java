package stringPrac;
//abcabcbb

import java.util.HashSet;
import java.util.Set;

public class longestSubstringWithoutRepeatingCharacterByOwn {
    public static void main(String[] args) {
        String s = "abcdeabc";
        Set<Character> seen = new HashSet<>();

        int i = 0, j = 0;
        int maxLength = 0;

        while (j < s.length()) {
            char currentChar = s.charAt(j);

            if (!seen.contains(currentChar)) {
                seen.add(currentChar);
                maxLength = Math.max(maxLength, seen.size());
                j++; // expand right
            } else {
                seen.remove(s.charAt(i)); // shrink from left
                i++;
            }
        }

        System.out.println("Length of Longest Substring: " + maxLength);
    }
}
