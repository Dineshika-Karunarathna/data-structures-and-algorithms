package arrays;

public class SearchInRotatedSortedArray {
    /* Leetcode Problem 33
     Problem Statement:
     You are given an integer array `nums` sorted in ascending order (with distinct values), 
     and an integer `target`. The array is rotated at an unknown pivot index (e.g., 
     [0,1,2,4,5,6,7] might become [4,5,6,7,0,1,2]).
    
     Given the array `nums` and `target`, return the index of `target` if it is present 
     in the array, or -1 if it is not.
    
     You must write an algorithm with O(log n) runtime complexity.

     Time Complexity: O(log n);
     Space Complexity; O(1);
     */

    public static int search(int[] nums, int target){
        int left = 0, right = nums.length-1;
        while (left<=right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {  // left part is sorted
                if (target >= nums[left] && target < nums[mid]) {   // target is in the left sorted part
                    right = mid - 1;
                } else {  // target is in the right part
                    left = mid + 1;
                }
            } else { // right part is sorted
                if (target > nums[mid] && target <= nums[right]) {   // target is in the right sorted part
                    left = mid + 1;
                } else {
                    right = mid - 1; // target is in the left part
                }
            }
        }
        return -1;
    }
}
