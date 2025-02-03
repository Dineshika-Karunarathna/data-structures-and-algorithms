package arrays;

import javax.print.attribute.EnumSyntax;
import java.util.*;

public class ThreeSum {
    
    /* Leetcode problem 15 - 3Sum
     Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that:
     - i, j, and k are distinct indices,
     - nums[i] + nums[j] + nums[k] == 0.
    
     Notice that the solution set must not contain duplicate triplets.
    
     Example:
       Input: nums = [-1, 0, 1, 2, -1, -4]
       Output: [[-1, -1, 2], [-1, 0, 1]]
    
     Constraints:
       - 3 <= nums.length <= 3000
       - -10^5 <= nums[i] <= 10^5


       Time Complexity: O(n^2) , Sorting the array - O(n log n), two-pointer technique - O(n)
       Space Complexity: O(1)
     */

    public static List<List<Integer>> threeSum(int[] nums){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for (int i=0; i<nums.length-2; i++){
            if (i>0 && nums[i]==nums[i-1]){
                continue;
            }
            int left = i + 1, right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));

                    while (left < right && nums[left] == nums[left + 1]) {
                        left++;
                    }

                    while (left < right && nums[right] == nums[right - 1]) {
                        right--;
                    }

                    left++;
                    right++;
                } else if (sum<0) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}
