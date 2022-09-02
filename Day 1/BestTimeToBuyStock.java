public class BestTimeToBuyStock {
    public static void main(String[] args) {
        int[] prices = { 1, 5, 8, 2, 12 };
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int curMax = prices[0];
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - curMax > max) {
                max = prices[i] - curMax;
            }
            if (curMax > prices[i])
                curMax = prices[i];
        }
        if (max < 0)
            return 0;
        return max;
    }
}
