class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int cur = m + n - 1;
        int index1 = m - 1, index2 = n-1;
        while ( index1 >= 0 && index2 >=0 ) {
            // if first array is larger than the second
            if(nums1[index1] > nums2[index2])
            {
                nums1[cur] = nums1[index1];
                --index1;
            }
            else{
                nums1[cur] = nums2[index2];
                --index2;
            }
            --cur;
        }
        while (index2 >= 0){
            nums1[index2] = nums2[index2];
            --index2;
        }
    }
}