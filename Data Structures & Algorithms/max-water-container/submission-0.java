class Solution {
    public int maxArea(int[] h) {
     int i = 0 ; 
     int j  = h.length-1;  
     int contain = 0; 
     int max = 0;
     while(i < j ){
        if(h[i] < h[j]){
            contain = h[i] * (j-i);
        }else{
            contain = h[j] * (j-i);
        }
        max = Math.max(max, contain);
        if(h[i] < h[j]){
            i++;
        }else{
            j--;
        }
     }
     return max;
    }
}
