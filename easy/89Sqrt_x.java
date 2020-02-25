class Solution {
    public int mySqrt(int x) {
        // newton method
        if (x == 0)
        {
            return 0;
        }
        int begin = 1;
        int end = x;
        int middle = 0;
        while (begin <= end)
        {
            middle = begin + (end - begin) / 2;
            if(middle == x / middle)
            {
                return middle;
            }
            else{
                if(middle<x/middle)
                {
                    begin = middle + 1;
                }
                else{
                    end = middle -1;
                }
            }
        }
        return end;
    }
}