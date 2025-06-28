package regexPractise;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regexDemo {
    public static void main(String[] args) {
        Pattern pattern= Pattern.compile("java",Pattern.CASE_INSENSITIVE);
        Pattern patternTwo=Pattern.compile("(?i)java");
        Matcher matcher=pattern.matcher("Java is fune");
        Matcher matcherTwo=patternTwo.matcher("Java is fune");
        System.out.println(matcher.find());
        System.out.println(matcherTwo.find());
    }
}
