## Arrays
---
### Advantages
- Store multiple elements of same type with one variable name
- Accessing elements by the index is fast

### Disadvantages
- When an element is added or removed, all the other elements should be shifted to accomadate the new element
- The array size is fixed in several languages(Java). Hence, to add a element, a new array need to be allocated anf copy all previous elements

## Time Complexity

| Operation                | Time Complexity      | Space Complexity | Reason                                                                     |
|--------------------------|----------------------|------------------|----------------------------------------------------------------------------|
| Access by index          | O(1)                 | O(1)             | Directly computes the memory location of the element                       |
| Search an element        | Worst case: O(n)     | O(1)             | Linear Search by looking at every element                                  |
|                          | Best case:  O(1)     | O(1)             | Target is the first element                                                | 
| Search in a sorted array | Worst case: O(log n) | O(1)             | Binary Search                                                              |
|                          | Best case:  O(1)     | O(1)             | Target is the middle element                                               | 
| Insert                   | Worst case: O(n)     | O(n)             | Inserting at the beginning. Need to shift all the elements to right by one |
|                          | Best case:  O(1)     | O(1)             | Inserting at the end                                                       |
| Remove                   | Worst case: O(n)     | O(1)             | Removing from the beginning. Need to shift all the elements to left by one |
|                          | Best case:  O(1)     | O(1)             | Removing from the end                                                      |

#### Sliding Window Technique

A fixed or variable size window is moved through a data structure, typicaly an array or sring to solve problems efficiently based on continuous subsets of elements (Subarrays or substrings).
The problems solved in O(n^2) using loops, can be solved in O(n) or O(nlog(n)) by sliding windows.

1) Fixed Size Sliding Window
  - Compute the result for first window
  - Use a loop to slide the window by one and compute the result
2) Variable Size Sliding Window
  - Increase the right pointer one by one until the condition is true.
  - If condition doesn't match, shrink the window by increasing the left pointer.
  - When condition satisfies, again increase the right pointer.

**Two pointers** : Similar to variable size sliding window with pointers can be crossed each other.   
**Index as a hash key** : If you are given a sequence and the interviewer asks for O(1) space, it might be possible to use the array itself as a hash table.  
**Traversing the array more than once** : Traversing the array twice/thrice (as long as fewer than n times) is still O(n). Sometimes traversing the array more than once can help you solve the problem while keeping the time complexity to O(n). 

## Problems
1) **TwoSum**: [Problem](https://leetcode.com/problems/two-sum/description/) | [Answer](TwoSum.java)  
Approach: Use a hashmap to store complements
2) **Best Time to Buy and Sell Stock**: [Problem](https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/) | [Answer](MaxProfit.java)   
Approach: Maximum Profit can be achieved at minimum buying price and maximum selling price, where the buying day should be before selling day.
3) **Product of Array Except Self**: [Problem](https://leetcode.com/problems/product-of-array-except-self/description/) | [Answer](ProductOfArrayExceptSelf.java)  
Approach: Traverse two times the array for opposite sides by multiplying one by one
4) **Maximum Subarray**: [Problem](https://leetcode.com/problems/maximum-subarray/description/) | [Answer](MaximumSubarray.java)  
Approach: Kadane's algorithm is used to solve this problem. 
It dynamically adjusts the current subarray (currentSum) and keeps track of the maximum sum seen so far (maxSum). 
If adding the current number would reduce the sum, the algorithm "abandons" the current subarray and starts fresh from the current number.
5) **Contains Duplicate**: [Problem](https://leetcode.com/problems/contains-duplicate/description/) | [Answer](ContainsDuplicate.java)  
Approach: Use a HashSet because it only stores unique elements, so it automatically handles duplicates for us. The add() method returns false if the element is already in the set.
  A HashSet is designed to store unique elements only. It doesn’t store any additional information, such as values associated with keys. In this problem, we only care about whether a number is already seen, not about storing additional data with it.
  HashMap would store both the key (the number) and the value (often a constant, like 1). This leads to unnecessary storage of additional data that is not needed in this case. 
6) **Maximum Product Subarray**: [Problem](https://leetcode.com/problems/maximum-product-subarray/description/) | [Answer](MaximumProductSubarray.java)  
Approach: The algorithm tracks both the maximum and minimum products encountered so far to handle the effect of negative numbers, which can flip a negative product into a positive one. At each step, it updates the maxProduct and minProduct based on the current element, and keeps track of the highest product found in the result. 
7) **Search in Rotated Sorted Array**: [Problem](https://leetcode.com/problems/search-in-rotated-sorted-array/description/) | [Answer](SearchInRotatedSortedArray.java)  
Approach: Use binary search by first determining which part (left or right) of the array is sorted. Depending on the target's value, we adjust the left and right pointers to search in the sorted half, ensuring the search space is reduced by half at each step. 
8) **3Sum**: [Problem](https://leetcode.com/problems/3sum/description/) | [Answer](ThreeSum.java)  
Approach: Sort the array first and use two-pointer technique. If the sum is less, increase the left pointer and when sum is more than zero, decrease the right pointer.
9) **Container With Most Water**: [Problem](https://leetcode.com/problems/container-with-most-water/description/) | [Answer](ContainerWithMostWater.java)  
Approach: Two pointer approach. Always move the pointer that points to the lower line.