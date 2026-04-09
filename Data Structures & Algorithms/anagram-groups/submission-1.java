class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       
        Map<String , List<String>> maps = new HashMap<>();
        for(int i = 0 ; i < strs.length; i++){
            String s = freq(strs[i]);
            if(!maps.containsKey(s)){
            maps.put(s,new ArrayList<>());}
            
         maps.get(s).add(strs[i]);

        }
        return new ArrayList<>(maps.values());
    }
    public String freq(String s){
        int[] f = new int[26];
        for(char c : s.toCharArray()){
            f[c-'a']++;
        }
        return Arrays.toString(f);
    }
}
