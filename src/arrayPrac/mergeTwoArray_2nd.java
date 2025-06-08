package arrayPrac;

import java.util.Arrays;

public class mergeTwoArray_2nd {
    public static void main(String[] args) {
    int[] arr1 = {1, 4, 7, 8, 10};
    int[] arr2 = {2, 3, 9};
        for(int i=0;i<arr1.length;i++){
        if(arr1[i]>arr2[0]){
            arr1[i]=arr1[i]+arr2[0];
            arr2[0]=arr1[i]-arr2[0];
            arr1[i]=arr1[i]-arr2[0];
            int ele=arr2[0];
            int j;
            for(j=1;j<arr2.length&&arr2[j]<ele;j++){
                arr2[j-1]=arr2[j];
            }
            arr2[j-1]=ele;
        }

    }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


}
}
