package streamAPI;

import java.util.Arrays;
import java.util.List;

public class printAndCountSpecificString {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "bat", "ant", "dog");
        words.stream().filter(word->word.startsWith("a")).forEach(System.out::println);
        Long count=words.stream().filter(word->word.startsWith("a")).count();
        System.out.println(count);
    }
}
