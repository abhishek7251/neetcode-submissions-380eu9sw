class Solution {

    public String encode(List<String> strs) {
StringBuilder str1 = new StringBuilder();
for(String s : strs){
    str1.append(s.length()).append("#").append(s);
    
}
return str1.toString();
    }

    public List<String> decode(String str) {

        List<String> result  = new ArrayList<>();
        int i = 0 ;
        while(i < str.length() ){
            int j = i;
            while(str.charAt(j)!= '#'){
                j++;
            }
            int l = Integer.parseInt(str.substring(i,j));
            j++;
            result.add(str.substring(j,j+l));
i=j+l;
        }
     return result;   
    }
}
