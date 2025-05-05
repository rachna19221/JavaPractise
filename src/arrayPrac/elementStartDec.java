package arrayPrac;

import java.util.ArrayList;
import java.util.Arrays;

public class elementStartDec {
    public static void elementFind() {
        int midx = 0;
        int arr[] = new int[]{0, 1, 2, 3, 2, 1};
        //One more way is to sort and just print the last element
        //Arrays.sort(arr);
        //System.out.println(arr[arr.length-1]);
        for(int i= 0;i <arr.length;i++){
            if(arr[i]>arr[i+1]){
                System.out.println("The number from which element start to decrease " + arr[i]);
                break;
            }
        }
    }
}
