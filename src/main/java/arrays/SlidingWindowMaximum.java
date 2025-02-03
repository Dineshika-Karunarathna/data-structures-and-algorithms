package arrays;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    
    /* Leetcode Problem 239
       Problem Statement: 
       You are given an array of integers `nums`, and there is a sliding window of size `k` which moves from the very left to the very right of the array. 
       You can only see the `k` numbers in the window at a time. Each time the sliding window moves, return the maximum value in the window.
       
       Constraints: 
       - `1 <= nums.length <= 10^5`
       - `-10^4 <= nums[i] <= 10^4` 
       - `1 <= k <= nums.length`
       
       Example:
       Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
       Output: [3,3,5,5,6,7]

       Time Complexity:
       Space Complexity:

     */

    public static int[] maxSlidingWindow(int[] nums, int k){

        if (nums == null || nums.length == 0 || k == 0) return new int[0];

        Deque<Integer> deque = new LinkedList<>();
        int[] result = new int[(nums.length-k+1)];

        for (int i=0; i<nums.length; i++) {
            // Remove elements outside the current window from the deque
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // Maintain decreasing order in the queue
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add the current element's index to the deque
            deque.offerLast(i);

            // Once we've processed the first k elements, the result is ready
            if (i>=k-1) {
                result[i-k+1] = nums[deque.peekFirst()];
            }
        }
        return result;
    }
}
