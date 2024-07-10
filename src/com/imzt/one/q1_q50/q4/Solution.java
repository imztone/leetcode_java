package com.imzt.one.q1_q50.q4;

import java.util.Arrays;

/**
 * q:<a href="https://leetcode.cn/problems/median-of-two-sorted-arrays">link</a>
 */
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) {
            return handle(nums2);
        }
        if (nums2.length == 0) {
            return handle(nums1);
        }
        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] ctn = new int[length1 + length2];
        int count = 0;
        for (int i : nums1) {
            ctn[count] = i;
            count++;
        }
        for (int i : nums2) {
            ctn[count] = i;
            count++;
        }
        return handle(Arrays.stream(ctn).sorted().toArray());
    }

    private double handle(int[] nums) {
        int n = nums.length;
        if (nums.length % 2 == 0) {
            return (nums[n / 2 - 1] + nums[n / 2]) / 2.0;
        } else {
            return nums[n / 2];
        }
    }
}