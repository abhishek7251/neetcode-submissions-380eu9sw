class Solution {
    public int[] twoSum(int[] nums, int t) {
        Map<Integer,Integer> index = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
if(index.containsKey(t - nums[i])){
    return new int[]{index.get(t - nums[i]),i};
}
index.put(nums[i] , i);
        }
        return new int[]{-1,-1};
    }
}
