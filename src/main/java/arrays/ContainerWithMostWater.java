package arrays;

public class ContainerWithMostWater {
    
    /* Leetcode Problem 11 
     Given an array `height` of length `n`, where each element represents the height of a vertical line drawn at the x-axis, 
     find two lines that together with the x-axis form a container, such that the container contains the most water.
    
     Return the maximum amount of water a container can store.
    
     Constraints:
     - `n` is greater than or equal to 2.
     - `height[i]` is a non-negative integer.
    
     Example:
     Input: height = [1,8,6,2,5,4,8,3,7]
     Output: 49

     Time Complexity: O(n)
     Space Complexity: O(1)
    */

    public static int maxArea(int[] height){
        int maxArea = 0, currentArea=0;
        int left=0, right = height.length-1;
        while (left<right){
            currentArea = Math.min(height[left],height[right])*(right-left);
            if (currentArea>maxArea){
                maxArea = currentArea;
            }
            // Move the pointer pointing to the shorter bar
            if (height[left]>height[right]){
                right--;
            }
            else{
                left++;
            }
        }
        return maxArea;
    }
}
