class Solution {
    public boolean isAnagram(String s, String t) {
        int sLength = s.length();
        int tLength = t.length();
        if(sLength != tLength){
            return false;
        }
        char sArray[] = s.toCharArray();
        char tArray[] = t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i=0; i<sLength;i++)
        {
            if(sArray[i]!=tArray[i])
            {
                return false;
            }

        }
        return true;
    }
}
