public class Solution {
    public int maxProfit(int[] prices) {
        int s = 0, b = 1;
        int maxP = 0;

        while (b < prices.length) {
            if (prices[s] < prices[b]) {
                int profit = prices[b] - prices[s];
                maxP = Math.max(maxP, profit);
            } else {
                s = b;
            }
            b++;
        }
        return maxP;
    }
}

