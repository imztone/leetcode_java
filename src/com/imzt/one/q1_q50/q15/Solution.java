package com.imzt.one.q1_q50.q15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        // 排序,递增数组确定左锚点
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        // (-2) 是为了保证能有三个元素参与计算
        for (int i = 0; i < nums.length - 2; i++) {
            // 如果左锚点大于 0,在递增数组里无法凑出和为 0 的三个元素
            if (nums[i] > 0) {
                break;
            }
            // 如果左锚点是之前已经计算过的值,直接跳过,无需重复计算
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            // 双指针,通过二分法向内收
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) {
                    // 小于 0,左指针前进
                    while (left < right && nums[left] == nums[++left]) ;
                } else if (sum > 0) {
                    // 大于 0,右指针后退
                    while (left < right && nums[right] == nums[--right]) ;
                } else {
                    result.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    while (left < right && nums[left] == nums[++left]) ;
                    while (left < right && nums[right] == nums[--right]) ;
                }
            }
        }
        return result;
    }
}