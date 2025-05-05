package stringPrac;

import java.util.HashMap;
import java.util.Map;

public class shiftedGroup {
    public static void group(){
        String[] input ={"abc", "bcd", "acef", "xyz", "az", "ba", "a", "z","cb", "yx", "zw"};
        Map<String,int[]> inputKey=new HashMap<>();
        for(String s:input){
            int [] keyValue = new int[0];
            if(s.length()>1){
            for(int i=0;i<s.length()-1;i++){
                keyValue[i]=s.charAt(i+1)-s.charAt(i);

            }
            inputKey.put(s,keyValue);
            }
            else if(s.length()==1){
                keyValue[0]=1000;
                inputKey.put(s,keyValue);
            }
            else{
                inputKey.put(s,keyValue);
            }
        }


    }
}
