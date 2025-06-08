package stringPrac;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating  {

        public int lengthOfLongestSubstring(String s) {
            int n = s.length();
            int maxLength = 0;
            int left = 0;  // Start of the sliding window
            HashSet<Character> set = new HashSet<>();

            for (int right = 0; right < n; right++) {
                // If character is already in the set, remove from left until no duplicate
                while (set.contains(s.charAt(right))) {
                    set.remove(s.charAt(left));
                    left++; // Shrink the window from the left
                }
                set.add(s.charAt(right)); // Add the new character to the set
                //maxLength = Math.max(maxLength, right - left + 1);
                 maxLength = Math.max(maxLength,set.size());//Update the max length
            }

            return maxLength;
        }

        public static void main(String[] args) {
            LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();

            /*String s1 = "abcabcbb";
            System.out.println("Input: " + s1);
            System.out.println("Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s1));  // Output: 3

            String s2 = "bbbbb";
            System.out.println("Input: " + s2);
            System.out.println("Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s2)); */ // Output: 1

            String s3 = "pwwkeww";
            System.out.println("Input: " + s3);
            System.out.println("Longest Substring Without Repeating Characters: " + solution.lengthOfLongestSubstring(s3) + " solution" + solution);  // Output: 3
        }
    }




