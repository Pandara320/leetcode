class Solution {
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++)
        {
            if(prices[i] > prices[i - 1])
            {
                maxprofit = maxprofit + (prices[i] - prices[i-1]);
            }
        }
        return maxprofit;
    }
}

/*

Time complexity : O(n)O(n). Single pass.

Space complexity: O(1)O(1). Constant space needed.

*/
