class Solution {
    public boolean wordPattern(String pattern, String str) {
        String [] a = str.split(" ");
        if(pattern.length()!= a.length) 
            return false;
        Map<Character, String> b = new HashMap<>();
        for (int i=0; i<pattern.length();i++)
        {
            if(!b.containsKey(pattern.charAt(i))){
                if(b.containsValue(a[i]))
                    return false;
                b.put(pattern.charAt(i),a[i]);
            }
            else{
                if(!b.get(pattern.charAt(i)).equals(a[i]))
                   return false;
            }
        }
        return true;
    }
}