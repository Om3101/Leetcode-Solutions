class Solution
{
    public int maxProfit(int[] prices) 
    {
        int b = prices[0];
        int profit = 0;

        for(int x = 1; x<prices.length;++x)
        {
            if(prices[x]<b)
            {
                b = prices[x];
            }
            else if(prices[x] - b >profit)
            {
                profit = prices[x]- b;
            }
        }
        return profit;
    }
}