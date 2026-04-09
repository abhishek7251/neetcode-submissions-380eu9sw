class Solution {
    public int maxProfit(int[] prices) {
        int minPrice = Integer.MAX_VALUE; 
 int mp= 0;
for(int price : prices ){
    if(price < minPrice){
        minPrice = price;
    }
    mp = Math.max(mp , price-minPrice);
}
return mp;
    }
}
