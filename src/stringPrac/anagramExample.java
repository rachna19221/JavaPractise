package stringPrac;

import java.util.Arrays;

public class anagramExample {
    public static boolean areAnagram(char str1[], char str2[]){
        if(str1.length!=str2.length){
            return false;
        }
        Arrays.sort(str1);
        Arrays.sort(str2);
        if(Arrays.toString(str1).equalsIgnoreCase(Arrays.toString(str2))){
            return true;
        }
        else{
            return false;
        }
    }
}
