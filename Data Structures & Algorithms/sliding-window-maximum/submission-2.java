class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
int i = 0;
int j = k;
int[] res  = new int[nums.length - k +1];
while( j-1 < nums.length){
int insert = maxval(nums,i,j);
res[i] = insert;
i++;
j++;


}return res;

    }
    public int maxval(int[] arr , int i , int j){
        int max = Integer.MIN_VALUE ;
for(int m = i ; m < j ; m++){
if(max < arr[m]){
    max = arr[m];
}
    }
    return max;
}}
