package arrayPrac;
/*

You're given an integer array arr[]. Remove all the even numbers from the array in-place, and return the length of the updated array.
 */

import java.util.ArrayList;

public class oddArray {
    public static void main(String[] args) {
        int[] arr ={2,12,3,4,5,90,21,7,89,91,21};
        //int[] arr2 = new int[0];
        //use array to list
        ArrayList<Integer> list = new ArrayList<>();
        for(int i:arr){
         if(i%2!=0) {
             list.add(i);
         }
        }
        System.out.println(list);

    }
}
