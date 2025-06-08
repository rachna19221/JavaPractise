package stringPrac;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
/*
Given:

A string s

An integer k

Task:

Return the length of the longest substring of s that contains exactly k distinct characters.

✅ Example 1
Input:
s = "eceebbeba"
eceebbeba
abcbbbbcccbdddadacb
xyzxyzyy

k = 2
Output:
3
Explanation:
The longest substring with exactly 2 distinct characters is "ece".
 */
public class longestSubstringKDistinctCharacter {
    public static void main(String[] args) {
    String word="aabacbebebe";
    int k=2;
    int j=0;
    int maxSize=0;
    char[] ch;
    Set<Character> distinctch=new HashSet<>();
    for(int i=k;i<word.length();i++) {
        ch = word.substring(j, i + 1).toCharArray();
        distinctch=distinctCharacter(ch);
        if(distinctch.size()>k){
            j=j+1;
        }
        else{
            maxSize=ch.length;
        }
    }
    System.out.println(maxSize);

    }
    public static Set<Character> distinctCharacter(char[] charArray) {
        Set<Character> distinctCh=new HashSet<>();
        for(char ch:charArray){
            distinctCh.add(ch);
        }
        return  distinctCh;
    }

}
