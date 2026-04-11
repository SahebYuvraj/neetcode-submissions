class Solution {
    public int maxProfit(int[] prices) {
        int start = 0; //both are pointers
        int end = 1;
        int price = 0;

        while(end < prices.length){
            if(prices[start]< prices[end]){
                int profit = prices[end] - prices[start];
                price = Math.max(profit, price);

            }
            else{
                start = end;
            }
            end++;
        }
        return price;
    }
}
