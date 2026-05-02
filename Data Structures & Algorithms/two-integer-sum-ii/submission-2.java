class Solution {
    public int[] twoSum(int[] nums, int t) {
        int l = 0 ;
        int r = nums.length-1;
        while(l < r){
            int x = nums[l] + nums[r];
            if(x == t)
            return new int[]{l+1,r+1};
            if(x < t){
                l++;
            }else
            r--;
        }
        return new int[]{-1,-1};
    }
}
