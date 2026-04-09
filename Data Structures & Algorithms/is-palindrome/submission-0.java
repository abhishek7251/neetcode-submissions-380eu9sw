class Solution {
    public boolean isPalindrome(String s) {
       StringBuilder clean = new StringBuilder();
       for(Character c : s.toCharArray()){
        if(Character.isLetterOrDigit(c)){
            clean.append(Character.toLowerCase(c));
        }}
        String str1 = clean.toString();
String str2 = clean.reverse().toString();
return str1.equals(str2);
       }
    
}
