package listPrac;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class kFrequency {
    public static void main(String[] args) {


    int nums[]={1,1,1,2,2,3};
    Set<Integer> s=new HashSet<>();
    Map<Integer, Integer> kf=new HashMap<>();
        for(int i:nums){
        if(kf.containsKey(i)){
            kf.put(i,kf.get(i)+1);
            if(kf.get(i)>=2){
                s.add(i);
            }
        }
        else{
            kf.put(i,1);
        }
    }
        System.out.println(s);

}

}
