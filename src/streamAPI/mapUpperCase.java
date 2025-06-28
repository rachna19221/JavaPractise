package streamAPI;

import java.util.Arrays;
import java.util.List;

public class mapUpperCase {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("apple", "banana");
        names.stream().map(String::toUpperCase).forEach(System.out::println);

    }

}
