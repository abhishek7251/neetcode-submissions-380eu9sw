class Solution {
    public boolean isPalindrome(String s) {
        char[] ca = s.replaceAll("\\s+" , "").toLowerCase().toCharArray();
        int l = 0 ; 
        int r = ca.length - 1;
        while(l<r){
            while(l<r && !Character.isLetterOrDigit(ca[l]) ) l++;
            while(l<r && !Character.isLetterOrDigit(ca[r])) r--;
            System.out.println(ca[l] + "and " + ca[r]);
            if(ca[l] != ca[r]){
                return false;
            }
            l++;r--;
        }
        return true ;
    }
}
