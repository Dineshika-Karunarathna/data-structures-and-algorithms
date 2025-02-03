package arrays;

public class MaximumProductSubarray {

    /* Leetcode Problem 152
    Given an integer array nums, find a subarray with the largest product, and return the product.
    
    A subarray is a contiguous subsequence of the array.
    
    Example 1:
    Input: nums = [2, 3, -2, 4]
    Output: 6
    Explanation: [2, 3] has the largest product 6.
    
    Example 2:
    Input: nums = [-2, 0, -1]
    Output: 0
    Explanation: The result cannot be achieved with any subarray larger than [-2] or [-1].
    
    Constraints:
    - 1 <= nums.length <= 2 * 10^4
    - -10 <= nums[i] <= 10

    Approach:
    While traversing through the array, update the parameters minProduct and maxProduct as negative elements can flip the result.

    Time Complexity: O(n)
    Space Complexity: O(1)
    */

    public static int maxProduct(int[] nums){
        int minProduct = nums[0], maxProduct=nums[0], result=nums[0];
        for (int i=1;i<nums.length;i++){
            int maxMultiplication = maxProduct*nums[i];
            int minMultiplication = minProduct*nums[i];
            maxProduct = Math.max(nums[i], Math.max(maxMultiplication, minMultiplication));
            minProduct = Math.min(nums[i], Math.min(maxMultiplication, minMultiplication));
            result = Math.max(result,maxProduct);
        }
        return result;
    }

}
