package stringPrac;
/*
Count Occurrences of Anagrams
Count how many anagrams of a pattern exist in a given string.
s = "forxxorfxdofr"
p = "for" just now
Explanation:

Anagrams of "for": "for", "fro", "orf", "ofr", "rfo", "rof"
Substrings matching anagrams in s: "for" (0), "orf" (4), "ofr" (9)
 */

import java.util.Arrays;

public class countOccurenceOfanAnagram {
    public static void main(String[] args) {
        String sub="forxxorfxdofr";
        String pa="for";
        char [] ch=pa.toCharArray();
        char [] ch2;
        Arrays.sort(ch);
        String paSorted=new String(ch);
        int j=0;
        int count=0;
        for(int i=pa.length()-1;i<sub.length();i++){
            ch2=sub.substring(j,i+1).toCharArray();
            Arrays.sort(ch2);
            String sortedCh2=new String(ch2);
            if(paSorted.equalsIgnoreCase(sortedCh2)){
                count=count+1;
            }
        j++;

        }
        System.out.println("No of anagram for "+sub +" of pattern  "+ pa +" is "+ count);
    }
}
