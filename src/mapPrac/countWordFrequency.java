package mapPrac;

import java.util.HashMap;
import java.util.Map;

public class countWordFrequency {
    public static void wordFrequency() {
        String input = "SDET automation testing automation QA SDET";
        Map<String, Integer> map = new HashMap<>();
        String inputList[] = input.split(" ");
        for(String word:inputList){
            if(map.containsKey(word)){
                map.put(word,map.get(word)+1);
            }
            else{
                map.put(word,1);
            }
        }
        System.out.println(map);
    }


}
