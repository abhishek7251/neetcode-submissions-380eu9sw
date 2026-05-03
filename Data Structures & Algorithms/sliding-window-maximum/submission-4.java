class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int[] result = new int[nums.length - k+1];
        int l = 0 ;
        int r = k-1;
        int i = 0 ;
        while(r< nums.length){
            int m = findmax(nums ,l , r );
            result[i] = m;
            l++;
            r++;
            i++;
        }
        return result;
    }
    public int findmax(int[] nums ,int  l , int r){
       int max = Integer.MIN_VALUE;
    for(int i = l ; i <= r ; i++){
            
                max = Math.max(max,nums[i]);
        
       
    } return max;
}}
