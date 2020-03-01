public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int result = 0;
        int count = 0;
        for ( int i =0; i<32; i++){
            result = result << 1;
                if((n & 0x1) == 1){
                    result | = 0x1;
                    count = count + 1;
                }
            n = n>>1;
        }
        return count;
        
    }
}
