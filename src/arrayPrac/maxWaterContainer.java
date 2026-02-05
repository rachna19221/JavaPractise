package arrayPrac;

/*Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case,
the max area of water (blue section) the container can contain is 49.
  #rotating of array
    #reverse string using recursion

 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class maxWaterContainer {
    public static void main(String[] args) {
        int [] arr={1,2,1,2,1,2,1,2,1,2};
        int countOne=0;
        int countTwo=0;
        //int[] arrTwo=new int[arr.length];
       for(int i:arr){
           if(i==1) {
               countOne++;
           }
           else if(i==2){
               countTwo++;
           }
       }
       for(int j=0;j<countOne;j++){
           arr[j]=1;
       }
        for(int j=countOne;j<arr.length;j++) {
            arr[j] = 2;
        }
        System.out.println(Arrays.toString(arr));
        }

    }




