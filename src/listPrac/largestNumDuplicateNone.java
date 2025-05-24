package listPrac;
/*

3. Given an array of integers, find the largest number that does not have any duplicates in the array.
Example:
Input:
arr = [4, 3, 2, 7, 3, 4, 8]
Output:
8
 */

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class largestNumDuplicateNone {

    public static void main(String[] args) {
        int arr[]={1, 2, 3, 1, 2, 3, 9} ;
        Arrays.sort(arr);
        int ge=0;
        Map<Integer,Integer> nf=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(nf.containsKey(arr[i])){
                nf.put(arr[i],nf.get(arr[i])+1);
            }
            else{
                nf.put(arr[i],1);
                if(i==arr.length-1)
                    ge=arr[i];
                else if((arr[i]>ge) && (arr[i+1]!=arr[i]) )
                    ge=arr[i];

            }
        }
        System.out.println(ge);

    }

}
