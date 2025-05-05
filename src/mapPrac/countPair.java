package mapPrac;

import java.util.HashMap;
import java.util.Map;

public class countPair {
    public static void pairCount(){
        int[] ary = {1,1,1,1,1,2,2};
        int totalCount=0;
        Map<Integer,Integer> nFreq=new HashMap<>();
        for(int num:ary){
            if(nFreq.containsKey(num)){
                nFreq.put(num,nFreq.get(num)+1);
            }
            else
                nFreq.put(num,1);
        }
        for(Map.Entry<Integer,Integer> hnum: nFreq.entrySet()){
            totalCount+=hnum.getValue()/2;
        }
        System.out.println("Total count of pair is "+ totalCount);
    }
}
