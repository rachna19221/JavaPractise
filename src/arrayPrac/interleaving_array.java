package arrayPrac;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class interleaving_array {
    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "def";
        String s3 = "adbcef";
        String s4=s1+s2;
        List<Character> cone=new ArrayList<>();
        List<Character> ctwo=new ArrayList<>();
        if(s1.length()!=s2.length()) System.out.println("not interleave");
        else{
            for(int i=0;i<s3.length();i++){
                cone.add(s3.charAt(i));
                ctwo.add(s4.charAt(i));
            }
            Collections.sort(cone);
            Collections.sort(ctwo);
            if(cone.equals(ctwo)) System.out.println("interleave");
            else System.out.println("not interleave");
        }
    }
}
