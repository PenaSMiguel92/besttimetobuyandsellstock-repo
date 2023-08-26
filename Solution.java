public class Solution {
    public int maxProfit(int[] prices) {
        int minimum = Integer.MAX_VALUE;
        int delta = Integer.MIN_VALUE;

        for (int i = 0; i < prices.length; i++) {
            minimum = Math.min(minimum, prices[i]);
            delta = Math.max(delta, prices[i] - minimum);
        }
        return delta;
    }
}
