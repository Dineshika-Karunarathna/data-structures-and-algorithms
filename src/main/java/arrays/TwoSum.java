package arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    /*
    * Problem: Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
    * Approach: Use HashMap to store complements
    * Time Complexity: O(n) , traverse through the array only once and each hash map operations takes constance time O(1)
    * Space Complexity: O(n), in the worst case, the hash map stores one entry for each number in the array.
     */

    public static int[] twoSum(int[] nums, int target) {
         Map<Integer, Integer> map = new HashMap<>();
         for (int i=0; i<nums.length; i++){
             int complement = target - nums[i];
             if (map.containsKey(complement)){
                 return new int[]{map.get(complement),i};
             }
             else{
                 map.put(nums[i],i);
             }
         }
         return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] result = twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}