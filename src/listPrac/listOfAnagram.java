package listPrac;

import java.util.*;

public class listOfAnagram {
    public static void listAnagram(){
        String strs[]={"eat","tea","tan","ate","nat","bat"};
        Map<String, List<String>> strValue= new HashMap<>();
        for(String s: strs){
            char[] strValueSorted=s.toCharArray();
            List<String> listValue;
            Arrays.sort(strValueSorted); //aet
            String keyStrValue=Arrays.toString(strValueSorted);
            if(strValue.containsKey(keyStrValue)) {
                listValue = strValue.get(keyStrValue);
                //listValue.add(s);
                //strValue.put(keyStrValue, listValue);
            }
            else {
                listValue = new ArrayList<>();
            }
            listValue.add(s);
            strValue.put(keyStrValue, listValue);






        }
        System.out.println(strValue.values());



    }

    public static void main(String[] args){
        listAnagram();
    }
}
