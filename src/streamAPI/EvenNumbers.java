package streamAPI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class EvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5,7,8,9,122,12,155,16);
        Collections.sort(nums);
        Collections.reverse(nums);
        List<Integer> odd=nums.stream().filter(nu->nu%2!=0).toList();
        System.out.println(odd);
        System.out.println("Even ------");
        nums.stream().filter(nu->nu%2==0).forEach(System.out::println);
        System.out.println("Odd ------");
        nums.stream().filter(nu->nu%2!=0).forEach(System.out::println);
    }
}
