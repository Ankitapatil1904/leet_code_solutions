class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int minPriceSoFar=Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minPriceSoFar=Math.min(prices[i],minPriceSoFar);
            maxProfit=Math.max(maxProfit,prices[i]-minPriceSoFar);
        }
        return maxProfit;
    }
}
