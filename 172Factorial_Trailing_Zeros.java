class Solution {
    public int trailingZeroes(int n) {
        int numZeros = 0;
        while(n != 0)
        {
            numZeros += (n= n/5);
        }
        return numZeros;
    }
}


/*

All trailing zeros are come from even_num x 5, we have more even_num than 5, so only count factor 5.

4! = 1x2x3x4 = 24, we haven’t encountered any 5 yet, so we don’t have any trailing zero.

5! = 1x2x3x4x5 = 120, we have one trailing zero. either 2×5, or 4×5 can contribute to that zero.

9! = 362880, we only encountered 5 once, so 1 trailing zero as expected.

10! = 3628800, 2 trailing zeros, since we have two numbers that have factor 5, one is 5 and the other is 10 (2×5)

What about 100! then?

100/5 = 20, we have 20 numbers have factor 5: 5, 10, 15, 20, 25, …, 95, 100.

Is the number of trailing zero 20? No, it’s 24, why?

Within that 20 numbers, we have 4 of them: 25 (5×5), 50 (2x5x5), 75 (3x5x5), 100 (4x5x5) that have an extra factor of 5.

So, for a given number n, we are looking how many numbers <=n have factor 5, 5×5, 5x5x5, …

Summing those numbers up we got the answer.

e.g. 1000! has 249 trailing zeros:

1000/5 = 200

1000/25 = 40

1000/125 = 8

1000/625 = 1

200 + 40 + 8 + 1 = 249

*/
