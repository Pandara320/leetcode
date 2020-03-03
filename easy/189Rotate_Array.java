class Solution {
    public void rotate(int[] nums, int k) {
        int[] myArray = new int[nums.length];
        for(int i = 0; i<nums.length; i++)
        {
            myArray[(i+k) % nums.length] = nums[i];
        }
        for(int i = 0; i < nums.length; i++)
        {
            nums[i] = myArray[i];
        }
    
    }
}

/*
Time complexity : O(n)O(n). One pass is used to put the numbers in the new array. And another pass to copy the new array to the original one.

Space complexity : O(n)O(n). Another array of the same size is used.

*/