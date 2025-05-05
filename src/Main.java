import arrayPrac.elementStartDec;
import arrayPrac.firstAndLastOccur;
import mapPrac.countPair;
import mapPrac.countWordFrequency;
import stringPrac.substringExample;

import java.util.List;

import static arrayPrac.findMissing.findMissingValue;
import static stringPrac.anagramExample.areAnagram;
import static stringPrac.substringExample.countOccurrences;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*String s = "Hello, World! World!";
        String sub = "World";
        substringExample obj = new substringExample();
        System.out.println(obj.countOccurrences(s, sub)); // Output: */
       /* char str1[] = { 't', 'e', 'w', 't' };
        char str2[] = { 't', 't', 'e', 'w' };
        if (areAnagram(str1, str2))
            System.out.println("The two strings are"
                    + " anagram of each other");
        else
            System.out.println("The two strings are not"
                    + " anagram of each other");*/


       // int a[] = { 1, 2, 6, 3, 4, 5 };
       // int b[] = { 2, 4, 3, 1, 0 };
       // findMissingValue(a, b);
        countWordFrequency.wordFrequency();
        countPair.pairCount();
        elementStartDec.elementFind();
        firstAndLastOccur.occurence();
    }
}