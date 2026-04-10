class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i =  0;
       int j = 0 ;
       int max = 0 ;
       StringBuilder str = new StringBuilder();
       Set<Character> set = new HashSet<>();
       while(j < s.length()){
str.append(s.charAt(j));
while(set.contains(s.charAt(j))){
    set.remove(s.charAt(i));
    i++;
}
max = Math.max(max,j-i+1);
set.add(s.charAt(j));
j++;
       } 
       return max;
    }
}
