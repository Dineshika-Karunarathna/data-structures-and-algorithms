package arrays;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

    /* Leetcode problem 217 
    Given an integer array nums, return true if any value appears at least twice in the array, 
    and return false if every element is distinct.

    TimeComplexity: O(1)
    Using HashMap, to store elements and frequencies, space complexity: O(n)
    By using HashSet, it only stores unique elements.
    Space Complexity: O(n)
    */

    public static boolean containsDuplicate(int[] nums) {
        //HashMap approach
//        Map<Integer,Integer> map = new HashMap<>();
//        for (int num : nums) {
//            if (map.containsKey(num)) {
//                return true;
//            } else {
//                map.put(num, 1);
//            }
//        }
//        return false;


//        HashSet Approach
        Set<Integer> seen = new HashSet<>();
        for (int num: nums){
            if(!seen.add(num)){   //Return false if the element was already in the set
                return true;
            }
        }
        return false;
    }
}
