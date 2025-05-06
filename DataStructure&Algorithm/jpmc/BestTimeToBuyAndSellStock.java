package jpmc;

class BestTimeToBuyAndSellStock {
    public int maxProfit(int[] prices) {

        // have a prev
        int prev = prices[0];

        // have a profit
        int profit = 0;

        // have a difference
        int diff = 0;

        for (int i = 1; i < prices.length; i++) {

            // find the diff
            diff += (prices[i] - prev);

            // if negative, then move to next
            if (diff < 0) {
                prev = prices[i]; // prev becomes the current index value
                diff = 0; // again become 0 as we are not choosing the day
                continue;
            }

            // if profit is less then diff, update profit
            if (profit < diff) {
                profit = diff;
            }
            prev = prices[i]; // prev becomes the current index value
        }

        // if we left with negative diff and profit 0
        if (profit <= 0 || diff < 0) {
            return 0;
        }

        return profit;
    }

    public static void main(String[] args) {
        BestTimeToBuyAndSellStock b = new BestTimeToBuyAndSellStock();
        System.out.println(b.maxProfit(new int[]{7,1,5,3,6,4}));
        System.out.println(b.maxProfit(new int[]{7,6,4,3,1}));
        System.out.println(b.maxProfit(new int[]{9, 3, 2, 1, 5, 8, 11, 2, 1 , 0}));
        System.out.println(b.maxProfit(new int[]{1,2, -3, 9}));
    }
}