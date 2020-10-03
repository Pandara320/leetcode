class Solution {
    public int firstUniqChar(String s) {
        int index = s.length();
        for (char c = 'a'; c <= 'z'; c++){
            int position1 = s.indexOf(c); // -1 is not exist;
            int position2 = s.lastIndexOf(c);
            if(position1 == position2 && position1 != -1){
                index = Math.min(index, position1);
            }
        }
        if (index == s.length()){
            return -1;
        }
        return index;
    }
}