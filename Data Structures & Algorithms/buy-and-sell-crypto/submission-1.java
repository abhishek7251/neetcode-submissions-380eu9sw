class Solution {
    public int maxProfit(int[] prices) {
        int max = Integer.MIN_VALUE;
        int minPrice = Integer.MAX_VALUE;
        for(int price : prices){
            minPrice = Math.min(minPrice , price);
            max  = Math.max(max , price - minPrice);
        }
        return max;
    }
}
