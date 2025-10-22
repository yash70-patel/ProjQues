import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int[] merged = new int[m + n];
        System.arraycopy(nums1, 0, merged, 0, m);
        System.arraycopy(nums2, 0, merged, m, n);
        Arrays.sort(merged);
        int len = merged.length;
        if (len % 2 == 0)
            return (merged[len/2 - 1] + merged[len/2]) / 2.0;
        else
            return merged[len/2];
    }
    public static void main(String[] args) {
        int[] param_1 = {1, 3};
        int[] param_2 = {2};
        double ret = new Solution().findMedianSortedArrays(param_1, param_2);
        System.out.println("Median is: " + ret);
    }
}
