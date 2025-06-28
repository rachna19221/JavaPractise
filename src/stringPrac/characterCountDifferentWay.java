package stringPrac;

public class characterCountDifferentWay {
    public static void main(String[] args) {
        String sValue = "aaaabBbCCccCDDD";
        sValue=sValue.toLowerCase();
        StringBuilder snew=new StringBuilder();
        for(int i=0;i<sValue.length();i++){
            snew=snew.append(sValue.charAt(i));
            snew=snew.append(sValue.lastIndexOf(sValue.charAt(i))-sValue.indexOf(sValue.charAt(i))+1);
            i=sValue.lastIndexOf(sValue.charAt(i));
        }
        System.out.println(snew);
    }

}
