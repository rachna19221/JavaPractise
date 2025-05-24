package stringPrac;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class characterCount {
    public static void main(String[] args) {
        String sValue = "aaaabBbCCccCDDD";
        char[] sCharArray = sValue.toCharArray();
        Map<Character, Integer> charCount = new HashMap<>();
        if (sCharArray.length > 1) {
            for (char c : sCharArray) {
                charCount.put(c,charCount.containsKey(c)?charCount.get(c) + 1:1);

            }
            System.out.println(charCount);
        }
    }
}
