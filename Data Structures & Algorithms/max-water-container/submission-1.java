class Solution {
    public int maxArea(int[] h) {
        int l = 0;
        int r = h.length-1;
 int max  =  Integer.MIN_VALUE;
        while(l < r ){
            int mins = Math.min(h[l] , h[r]);
            int volume  = mins * (r-l);
            max = Math.max(max ,volume);
            if(h[l] < h[r]){
                l++;
            }else 
            r--;
        }
        return max;
    }
}
