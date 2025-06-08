package stringPrac;

/*
find all anagram in a string
ifailuhkqqabbakkkk
 */

import java.util.*;

public class allAnagraminString {
    public static void main(String[] args) {
        String s="ifailuhkqqabbakkkk";
        Map<String, List<String>> possibleAnagram= new HashMap<>();
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                List<String> anaList;
                String svalue=s.substring(i,j+1);
                char [] ch=svalue.toCharArray();
                Arrays.sort(ch);
                String sortedsValue=new String(ch);
                if(possibleAnagram.containsKey(sortedsValue)){
                    anaList=possibleAnagram.get(sortedsValue);
                }
                else{
                    anaList=new ArrayList<>();
                }
                anaList.add(svalue);
                possibleAnagram.put(sortedsValue,anaList);

            }
        }
        int sum=0;
        int f=0;
        for(Map.Entry<String, List<String>> entry:possibleAnagram.entrySet()){
            f=entry.getValue().size();
            if(f>1)
                sum+=(f*(f-1))/2;
        }

        System.out.println(sum);
    }

}

