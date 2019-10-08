package tasks.medianOfTwoSortedArrays;

import java.util.Arrays;
//There are two sorted arrays nums1 and nums2 of size m and n respectively.
//
//        Find the median of the two sorted arrays. The overall run time complexity should be O(log (m+n)).
//
//        You may assume nums1 and nums2 cannot be both empty.
//
//        Example 1:
//
//        nums1 = [1, 3]
//        nums2 = [2]
//
//        The median is 2.0
//        Example 2:
//
//        nums1 = [1, 2]
//        nums2 = [3, 4]
//
//        The median is (2 + 3)/2 = 2.5


public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int [] array = new int[nums1.length+nums2.length];
        System.arraycopy(nums1, 0,array,0,nums1.length);
        System.arraycopy(nums2,0,array,nums1.length,nums2.length);
        double result = 1.0;
        Arrays.sort(array);
        if(array.length%2!=0) return 1.0*array[(array.length-1)/2];
        else    return (1.0 * array[((array.length)/2)-1] + array[((array.length)/2)])/2;
    }
}
