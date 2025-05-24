package arrayPrac;

import java.util.Collections;
import java.util.TreeSet;

public class thirdlargetintarray {
    public static void main(String[] args) {
        int[] nums = {2, 4, 1, 6, 5, 9, 4};
        TreeSet<Integer> set = new TreeSet<>(Collections.reverseOrder());

        for (int num : nums) {
            set.add(num);
        }
        System.out.println(set);

    }

}
