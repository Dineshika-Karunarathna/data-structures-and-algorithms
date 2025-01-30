package arrays;

public class ProductOfArrayExceptSelf {
    /* LeetCode Problem 238
    Problem Statement:
    Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to 
    the product of all the elements of `nums` except `nums[i]`. The product should be calculated 
    without using the division operation.
    
    Constraints:
    - 2 <= nums.length <= 10^5
    - -30 <= nums[i] <= 30
    - The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

    Time Complexity: O(n)
    Space Complexity: O(1), as output array does not count as extra space for space complexity analysis

    Approach:
    First pass (Left Products)
    Second Pass (Right Products)
     */


    public static int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        result[0] = 1;
        for (int i=1; i<nums.length; i++){
            result[i] = result[i-1] * nums[i-1];
        }
        int multipleValue = 1;
        for (int i= nums.length-2; i>=0; i--){
            multipleValue = multipleValue * nums[i+1];
            result[i] = result[i]*multipleValue;
        }

        return result;
    }
}
