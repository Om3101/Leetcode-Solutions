class Solution
{
    public int maxProfit(int[] prices)
    {
        int buy = prices[0];
        int profit = 0;

        int n = prices.length;

        for(int i=1; i<n; i++)
        {
            if(prices[i] < buy) {
                buy = prices[i];     //  buy at minimum
            }
            else if(prices[i] - buy > profit)
            {
                profit  = prices[i] - buy;   // max profit
            }
        }
        return profit;
    }
}