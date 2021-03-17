class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; // for string s
        int j = 0; // for string t
        int result = 0;
        while(i<s.length()){
            if(s.charAt(i) == t.charAt(j)){
                result = result + 1;
                i++;
                j++;
            }
            else
                j++;
        }
        if(result == s.length())
            return true;
        else
            return false;
   }
}
