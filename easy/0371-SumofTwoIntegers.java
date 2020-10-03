class Solution {
    public int getSum(int a, int b) {
        // carry now contains common set bits of x and y
        while(b!=0){
            int  carry = a & b;
            a = a ^ b;
            b = carry << 1;
        }
        return a;
    }
}
