class Solution {
    public int missingNumber(int[] nums) {
        int firstSum = 0;
        int countSum = nums.length;
        for (int i = 0; i < nums.length; i++)
        {
            countSum += i;
            firstSum += nums[i];
        }
        return countSum - firstSum;
    }
}