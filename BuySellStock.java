import java.util.*;

public class BuySellStock {

    // 👉 Write your logic here
    public static int maxProfit(int[] prices) {

        int min_price = Integer.MAX_VALUE;
        int profit = 0;

        for(int i = 0; i<prices.length ; i++){
            if(prices[i]<min_price){
                min_price = prices[i];
            }

            profit = Math.max(profit,prices[i]-min_price);
        }
        
        // YOUR LOGIC HERE
        
        return profit; // default
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 👉 Input
        int n = sc.nextInt();
        int[] prices = new int[n];

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextInt();
        }

        // 👉 Function Call
        int result = maxProfit(prices);

        // 👉 Output
        System.out.println(result);

        sc.close();
    }
}