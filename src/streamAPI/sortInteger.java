package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class sortInteger {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(5, 1, 3, 2);
        nums.stream().sorted().forEach(System.out::println);
        System.out.println(nums);
        List<Integer> sortedNums=nums.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedNums);
    }


}
