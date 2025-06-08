package arrayPrac;

/*

You're given an array of integers arr[]. Write a function to check whether the array is a palindrome or not.

An array is a palindrome if it reads the same from the beginning and the end.
 */
public class arrayPallindrome {

    public static void main(String[] args) {
        int[] arr = {2, 12, 3, 4, 5, 90, 5, 4, 3, 12, 2};
        int[] arr2 = {2, 12, 3, 4, 5, 90, 5, 6, 3, 12, 2};
        System.out.println(arr +" is pallindrome "+ checkArrayPallindrome(arr));
        System.out.println(arr2 +" is pallindrome "+ checkArrayPallindrome(arr2));

    }
    public static boolean checkArrayPallindrome(int[] arr){
        boolean isPallindrome=true;
        int i=0;
        int j=arr.length-1;
        while(i <arr.length/2){
            if(arr[i]!=arr[j]){
                isPallindrome=false;
                break;
            }
            i++;
            j--;
        }
return isPallindrome;
    }
}
