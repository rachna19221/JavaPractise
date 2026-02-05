package arrayPrac;

public class stock {
    public static int maxProfit(int[] prices) {
        int mp=Integer.MAX_VALUE;
        int maxp=0;
        for(int p:prices){
            if(p<mp){
                mp=p;
            }
            else if(p-mp>maxp){
                maxp=p-mp;

            }
        }
        return (maxp);

    }
    public static void main(String[] args){
        int[] prices1 = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices1));
    }

}
