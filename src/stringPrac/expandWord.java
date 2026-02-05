package stringPrac;
//A2BC3DE2F -> ABBEDDDEFF

public class expandWord {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder();
        String str2="A2BC3DE2F";
        for (int i=0;i<str2.length();i++){
            if(Character.isDigit(str2.charAt(i))){
                int d=Character.getNumericValue(str2.charAt(i));
                for(int j=0;j<d-1;j++){
                    str.append(str2.charAt(i+1));

                }
            }
            else
                str.append(str2.charAt(i));

        }
        System.out.println(str2);
        System.out.println(str);


    }
}
