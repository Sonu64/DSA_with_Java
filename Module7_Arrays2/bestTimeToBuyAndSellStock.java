public class bestTimeToBuyAndSellStock {

    public static int calculateMaxProfit(int prices[], int SIZE) {
        int leastBuyingPrice = Integer.MAX_VALUE;
        int todaysProfit = 0, maxProfit = 0;
        int buyingDay = 0, sellingDay = 0;
        for (int i = 0; i < SIZE; i++) {
            // Profit Case, if we can make profit just sell it !
            if (leastBuyingPrice < prices[i]) {
                todaysProfit = prices[i] - leastBuyingPrice;
                maxProfit = Math.max(todaysProfit, maxProfit);
                // We should update selling day only when maxProfit is todaysProfit
                if (maxProfit == todaysProfit)
                    sellingDay = i+1;
            }

            // Loss Case, leastBuyingPrice > prices[i], we got an even lesser buying price
            else {
                leastBuyingPrice = prices[i];
                buyingDay = i+1;
            }
        }
        System.out.printf("Buy the Stock on Day-%d and Sell it on Day-%d. \n", buyingDay, sellingDay);
        return maxProfit;
    }

    public static void main (String[] args) {
        int prices[] = {7, 1, 5, 3, 6, 4};
        int maxProfit = calculateMaxProfit(prices, prices.length);
        System.out.println("Maximum Profit Possible is " + maxProfit + " rupees.");
    }
}
