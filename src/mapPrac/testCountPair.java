package mapPrac;

import java.util.*;

public class testCountPair {
    public static void main (String args[]) {
        int fcountTotal=0;
        int[] ary = {1,1,1,1,1,2,2};
        ArrayList<Integer> list = new ArrayList<Integer>(ary.length);
        for (int i : ary)
        {
            list.add(i);

        }
        HashMap<Integer,Integer> hmap = new HashMap<Integer,Integer>();
        Set<Integer> str1 = new HashSet<Integer>();{
            for ( Integer str21 : list) {
                if (str1.add(str21) == false) {

                    // System.out.println(str21 + " occurs: " + Collections.frequency(list, str21));

                    hmap.put(str21, Collections.frequency(list, str21));
                    // System.out.println(hmap);
                }}

            for (HashMap.Entry<Integer, Integer> entry : hmap.entrySet()) {
                int counter = entry.getValue();
//				if (counter%2==0) {
//			    	fcounteven= counter/2;
//			    }else {
//			    	 fcountodd = (counter-1)/2;
//			    }
                fcountTotal+=counter/2;
            }
            //fcountTotal = fcounteven+fcountodd;
            //fcountTotal=fcounteven++;
            System.out.println(fcountTotal + ":is final count");
        }

    }
}
