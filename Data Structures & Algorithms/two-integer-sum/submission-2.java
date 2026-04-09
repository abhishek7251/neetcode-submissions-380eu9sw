class Solution {
    public int[] twoSum(int[] nums, int target) {
     HashMap<Integer , Integer> freq = new HashMap<>();
     freq.put(nums[0], 0);
     for(int i = 1 ; i < nums.length ; i++){
       int x = target - nums[i];
        if(freq.containsKey(x)){
return new int[]{freq.get(x),i};
        }
        freq.put(nums[i],i);
     }return new int[]{0,0};
     
     
     
     }
}
