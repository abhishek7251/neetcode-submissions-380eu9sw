class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
//         List<List<String>> result = new ArrayList<>();
//         for(int i = 0 ; i < strs.length-1 ; i++){
//             List<String> temp = new ArrayList<>();
//             temp.add(strs[i]);
//             for(int j = i+1 ; j < strs.length ; j++){
//                 if(checkAnagrams(strs[i],strs[j])){
//                     temp.add(strs[j]);
//                 }
//             }
// result.add(temp);
//         }
//         return result ;


Map<String, List<String>> map = new HashMap<>();
for (String w : strs) {
    char[] ca = w.toCharArray();
    Arrays.sort(ca);
    map.computeIfAbsent(new String(ca), k -> new ArrayList<>()).add(w);
}
return new ArrayList<>(map.values());
    }
    public boolean checkAnagrams(String str1 , String str2){
        int[] freq = new int[26];
        for(char c : str1.toCharArray()){
            freq[c-'a']++;
        }
        for(char c : str2.toCharArray()){
            freq[c-'a']--;
        }
        for(int i : freq){
            if(i!=0){
                return false;
            }
        }
        return true;
        
    }
}
