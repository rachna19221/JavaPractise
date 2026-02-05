package arrayPrac;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class testSwirssRe {
    public static void main(String[] args){
        String inpS="This is a string";
        StringBuilder sb = new StringBuilder();
        String inpTwo[]=inpS.split(" ");

        for(int k=inpTwo.length-1;k>=0;k--) {
            String inp=inpTwo[k];
            char rev[] = inp.toCharArray();
            int i=inp.length()-1;
            int j=0;
            while (j < i) {
                if (!Character.isLetter(inp.charAt(i))) i--;
                else if (!Character.isLetter(inp.charAt(j))) j++;
                else {
                    char temp = rev[i];
                    rev[i] = inp.charAt(j);
                    rev[j] = temp;
                    i--;
                    j++;
                }

            }
            String revWord=new String(rev);

            if (!sb.isEmpty()) sb.append(' ');
            sb.append(revWord);

            }
        System.out.println(sb);




        }





    }

