package Day15;

public class stockMarket {

    public static void main(String[] args) {

        // int prices[] = { 7, 1, 5, 3, 6, 4 };
        int prices[] = { 2, 5, 8, 6, 4, 10, 3 };
        int n = prices.length;
        int buyPrice = Integer.MAX_VALUE; // +infinit
        int day = 0;

        int maxProfit = 0;

        for (int i = 0; i < n; i++) {
            // check buyprice < current Price
            if (buyPrice < prices[i]) {
                // you have to sell
                int profit = prices[i] - buyPrice;
                maxProfit = Math.max(maxProfit, profit);
                day = i;

            } else {
                // if selling price is less then of , buying price
                // then you buy
                buyPrice = prices[i];
            }
        }

        System.out.println("profit of the day : " + day + "," + "Profit is:" + maxProfit);

    }

}
