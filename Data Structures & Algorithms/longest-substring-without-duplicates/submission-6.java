class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> str = new HashSet<>();
        int l = 0 ;
        int max = 0;
        for(int i = 0 ; i < s.length()  ;i++){
                while(str.contains(s.charAt(i))){
                    
                    str.remove(s.charAt(l));
                    l++;
                }
                str.add(s.charAt(i));
                max = Math.max(max , str.size());
               
        }return max;
    }
}
