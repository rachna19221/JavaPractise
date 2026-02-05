package arrayPrac;

import java.util.Arrays;

public class oneTwoArraySort {
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
