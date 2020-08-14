package com.neusoft.leetcode.one;

import java.util.Arrays;

/**
 * @author Eric Lee
 * @date 2020/8/14 08:50
 */
public class Solution {

    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if(nums[i] + nums[j] == target){
                    // 返回索引的位置
                    return  new int[]{i, j};
                }
            }
        }
        return null;
    }
}



//    public static void main(String[] args) {
//
//        int[] nums = new int[]{2, 7, 11, 15};
//        int target = 9;
//        System.out.println(Arrays.toString(new Solution().twoSum(nums, target)));
//    }