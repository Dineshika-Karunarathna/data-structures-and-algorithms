package arrays;

public class MaximumSubarray {

    /* Leetcode Problem 53
    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum 
    and return its sum.
    
    A subarray is a contiguous part of an array.
    
    Example:
    Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
    Output: 6
    Explanation: [4,-1,2,1] has the largest sum = 6

    Time complexity: O(n)
    Space complexity: O(1)
     */

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0], maxCurrent = nums[0];
        for (int i = 1; i<nums.length; i++){
            maxCurrent = Math.max(nums[i], maxCurrent + nums[i]);
            maxSum = Math.max(maxSum, maxCurrent);
        }
        return maxSum;
    }
}
