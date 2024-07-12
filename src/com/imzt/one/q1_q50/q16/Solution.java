package com.imzt.one.q1_q50.q16;

import java.util.Arrays;

@SuppressWarnings("unused")
class Solution {
    public int threeSumClosest(int[] nums, int target) {
        if (nums.length <= 3) {
            return Arrays.stream(nums).sum();
        }
        // 先排序,减少后续操作步骤
        Arrays.sort(nums);
        int ans = nums[0] + nums[1] + nums[2];
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (Math.abs(sum - target) < Math.abs(ans - target)) {
                    ans = sum;
                }
                if (ans == target) {
                    return ans;
                } else if (sum > target) {
                    right--;
                } else if (sum < target) {
                    left++;
                }
            }
        }
        return ans;
    }
}