public class bestTimeToBuyAndSellStock {

    public static int calculateMaxProfit(int prices[], int SIZE) {
        int leastBuyingPrice = Integer.MAX_VALUE;
        int todaysProfit = 0, maxProfit = 0;
        for (int i = 0; i < SIZE; i++) {
            // Profit Case, if we can make profit just sell it !
            if (leastBuyingPrice < prices[i]) {
                todaysProfit = prices[i] - leastBuyingPrice;
                maxProfit = Math.max(todaysProfit, maxProfit);
            }
            // Loss Case, leastBuyingPrice > prices[i], we got an even lesser buying price
            else {
                leastBuyingPrice = prices[i];
            }
        }
        return maxProfit;
    }

    public static void main (String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = calculateMaxProfit(prices, prices.length);
        System.out.println("Maximum Profit Possible is " + maxProfit + " rupees.");
    }
}
