package arrayPrac;

import java.util.*;

public class CoinChangeMod {
    public static void main(String[] args) {
        List<Integer> coins = Arrays.asList(1,2,5,10,20,50,100,200,500);
        Collections.sort(coins);
        int amount = 10000;
        int remainingSum= 10000-coins.stream().mapToInt(n->n*2).sum();
        System.out.println(remainingSum);
        System.out.println(remainingSum);
        int noOfCoin;
        Map<Integer, Integer> coinAndNoOfCoinMapping = new HashMap<>();
        // Check edge case
        if (amount < 1) System.out.println(0);
        // Create DP array
        int[] minCoinsDP = new int[amount + 1];
        for (int i = coins.size()-1; i >= 0; i--) {
            if (remainingSum >= coins.get(i)) {
                noOfCoin = remainingSum / coins.get(i);
                coinAndNoOfCoinMapping.put(coins.get(i), noOfCoin+5);
                remainingSum = remainingSum % coins.get(i);

            }
        }
        for (Map.Entry<Integer, Integer> entry : coinAndNoOfCoinMapping.entrySet()) {
            System.out.println(entry);
        }
    }
}
