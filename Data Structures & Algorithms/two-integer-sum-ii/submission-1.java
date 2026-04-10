class Solution {
    public int[] twoSum(int[] nums, int target) {
      
      int i = 0 ; 
      int j = nums.length-1;
      while(i<j){
        int find = nums[i] + nums[j];
        if( find == target){
            return new int[]{i+1,j+1};
        }else if(find < target){
        i++;
        }else{
            j--;
        }

      }
      
      
        // Map<Integer, Integer> map = new HashMap<>();
        // for(int i = 0 ; i < nums.length ;i++){
        //     if(map.containsKey(target-nums[i])){
        //         return new int[]{map.get(target-nums[i])+1,i+1};
        //     }
        //     map.put(nums[i],i);
        // }
        return new int[]{-1,-1};
    }
}
