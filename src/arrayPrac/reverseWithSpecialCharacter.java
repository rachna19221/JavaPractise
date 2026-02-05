package arrayPrac;

public class reverseWithSpecialCharacter {
    public static void main(String[] args){
        String inp="Aer@pl@ne";
        int i=inp.length()-1;
        int j=0;
        char rev[]=inp.toCharArray();

        while(j<i){
            if(!Character.isLetter(inp.charAt(i)))i--;
            else if(!Character.isLetter(inp.charAt(j)))j++;
            else{
                char temp=rev[i];
                rev[i]=inp.charAt(j);
                rev[j]=temp;
                i--;j++;
            }

        }
        System.out.println(rev);


    }

}
