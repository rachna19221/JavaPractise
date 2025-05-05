package stringPrac;

public class substringExample {
    public static int countOccurrences(String s, String sub) {
        int count = 0;
        int index = 0;

        while ((index = s.indexOf(sub, index)) != -1) {
            count++;
            index += sub.length();
        }
        return count;
    }


}
