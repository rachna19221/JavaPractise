package arrayPrac;

import java.util.Arrays;

/*
extra space mean You're given two sorted arrays arr1[] and arr2[]. Your task is to merge them in-place such that arr1 contains the first N smallest elements and arr2 the remaining ones.

Do not use any extra space.
 */
public class mergeTwoArray_1st {
    public static void main(String[] args) {
        int[] arr1 = {1, 4, 7, 8, 10};
        int[] arr2 = {2, 3, 9};
        for(int i=0;i<arr1.length;i++){
                if(arr1[i]>arr2[0]){
                    arr1[i]=arr1[i]+arr2[0];
                    arr2[0]=arr1[i]-arr2[0];
                    arr1[i]=arr1[i]-arr2[0];
                    Arrays.sort(arr2);
                }

            }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));


        }
    }

