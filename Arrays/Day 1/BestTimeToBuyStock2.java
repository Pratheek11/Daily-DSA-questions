// https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii

public class BestTimeToBuyStock2 {
    public static void main(String[] args) {
        int[] arr = { 7, 1, 5, 4, 8 };
        System.out.println(maxProfit(arr));
    }

    public static int maxProfit(int[] prices) {
        int totalMax = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                totalMax += prices[i] - prices[i - 1];
            }
        }
        return totalMax;
    }
}
