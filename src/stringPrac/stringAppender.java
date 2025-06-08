package stringPrac;

import java.util.*;

public class stringAppender {
    public static void main(String[] args) {
        String[] input = {
                "aZZZZZai___",
                "azup****III",
                "uklMMMnnnn",
                "zebra$123",
                "apple@home",
                "xoxo***yay",
                "zman___cool"
        };

        List<String> startList = new ArrayList<>();
        List<String> middleList = new ArrayList<>();
        List<String> endList = new ArrayList<>();

        for (String s : input) {
            String cleaned = s.replaceAll("[^a-zA-Z]", ""); // remove special characters

            //if (cleaned.isEmpty()) continue;

            char firstChar = Character.toLowerCase(cleaned.charAt(0));
            if (firstChar == 'a') {
                startList.add(cleaned.toUpperCase());
            } else if (firstChar == 'z') {
                endList.add(cleaned);
            } else {
                middleList.add(cleaned);
            }
        }

        // Combine all parts
        StringBuilder finalResult = new StringBuilder();
        for (String str : startList) finalResult.append(str);
        for (String str : middleList) finalResult.append(str);
        for (String str : endList) finalResult.append(str);

        System.out.println("Final Combined String: " + finalResult);
    }
}
