package arrayPrac;
/*
Rupee notes
1,2,5,10,20,50,100,200,500
Minimum 5 notes to be used for each type. The sum should be 10000
 */


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class coinChange {


    public static void main(String[] args) {
        int[] coins={1,2,5,6,9};
        Arrays.sort(coins);
        int amount=11;
        int noOfCoin;
        Map<Integer,Integer> coinAndNoOfCoinMapping=new HashMap<>();
        // Check edge case
        if (amount < 1) System.out.println(0);
        // Create DP array
        int[] minCoinsDP = new int[amount + 1];
        for (int i = coins.length-1; i>=0; i--) {
            if(amount>=coins[i]){
                noOfCoin=amount/coins[i];
                coinAndNoOfCoinMapping.put(coins[i],noOfCoin);
                amount=amount%coins[i];

            }
        }
for(Map.Entry<Integer, Integer> entry:coinAndNoOfCoinMapping.entrySet()){
    System.out.println(entry);
}

    }

}