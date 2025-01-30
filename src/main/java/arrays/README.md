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
- [TwoSum](TwoSum.java) (Problem: https://leetcode.com/problems/two-sum/description/)
- []