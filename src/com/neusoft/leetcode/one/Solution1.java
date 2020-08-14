package com.neusoft.leetcode.one;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Eric Lee
 * @date 2020/8/14 09:11
 */
public class Solution1 {
        public static void main(String[] args) {

        int[] nums = new int[]{2,  11, 15 ,7};
        int target = 9;
        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
    }
    public int[] twoSum(int[] nums, int target){
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int num = target - nums[i];
            if (map.containsKey(num)){
                return new int[]{map.get(num),i};
            }
            map.put(nums[i], i);
        }

        return null;
    }
}
