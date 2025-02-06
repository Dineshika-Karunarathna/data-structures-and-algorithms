# Strings
---
- A string is a sequence of characters.
- Java provides three different classes for handling strings (String, StringBuilder, StringBuffer)

### String (Immutable)
- Immutable (Any modification creates a new String)
- Stored in the String Pool for reuse (memory optimization). 
- Best for fixed, unchanging text.

| Operation                | Time Complexity    | Space Complexity | Reason                                                                        |
|--------------------------|--------------------|------------------|-------------------------------------------------------------------------------|
| Access (charAt(i))       | O(1)               | O(1)             | Direct index access                                                           |
| Concatenation(+)         | O(n)               | O(n)             | Creates a new string each time                                                |
| Substring(substring(a,b) | O(n)               | O(n)             | Creates a new string                                                          |
| Replace(replace(a,b)     | O(n)               | O(1)             | Scans entire string                                                           | 
| Split(split(regex))      | O(n)               | O(n)             | Creates an array of substrings                                                |
| Length(length())         | O(1)               | O(1)             | Directly stored value                                                         |
| Compare(equals())        | O(n)               | O(1)             | Compares character by character                                               |
| Compare (compareTo())    | O(n)               | O(1)             | Lexicographical comparison                                                    |

Avoid using + for concatenation inside loops (use StringBuilder instead).

### StringBuilder (java.lang.StringBuilder)
- Mutable (Modifications happen in the same object)
- Best for string manipulations
- Not thread safe (Better for single-threaded apps)


| Operation            | Time Complexity | Space Complexity | Reason                                 |
|----------------------|-----------------|------------------|----------------------------------------|
| Append (append(x))   | O(1)*           | O(1)             | Amortized O(1), but O(n) when resizing |
| Insert (insert(i,x)) | O(n)            | O(n)             | Shifts characters                      |
| Delete (delete(i,x)) | O(n)            | O(n)             | Shifts characters                      |
| Reverse (reverse())  | O(n)            | O(n)             | In-place reversal                      | 
| ToString(toString()) | O(n)            | O(n)             | Creates a new String                   |

### StringBuffer (java.lang.StringBuffer)
- Similar to StringBuilder but thread-safe (uses synchronization). 
- Use only when multi-threading is required.

| Operation            | Time Complexity | Space Complexity | Reason                                   |
|----------------------|-----------------|------------------|------------------------------------------|
| Append (append(x))   | O(1)*           | O(1)             | Same as StringBuilder but synchronized   |
| Insert (insert(i,x)) | O(n)            | O(n)             | Slower than StringBuilder due to locking |

To find the index of a character(ch) in the alphabet => ch - 'a'
## Common data structures for looking up strings

### Trie/Prefix Tree
A Trie (Prefix Tree) is a tree-based data structure used to efficiently store and search words or prefixes.  
✔ Use Trie for prefix-based problems, word search, auto-completion, and dictionary-based tasks.  
❌ Avoid Trie for exact string matching, palindromes, sorting, or when space is a concern.

          (root)
         /     \
        c       b
       / \       \
      a   a       a
     /     \       \
    t       p       t   <- (End of words: "cat", "cap", "bat") 
![img.png](img.png)  

| Operation | Time Complexity |
|-----------|-----------------|
| Insert    | O(n)            | 
| Search    | O(n)            |


[Implementation of a Trie](Trie.java)  

### Suffix Tree
- A Suffix Tree is a compressed trie-like data structure used for fast substring search, pattern matching, and longest repeated substrings.
- It stores all suffixes of a string.
![img_1.png](img_1.png)

[Implementation of SuffixTree](SuffixTree.java)

### Rabin Karp 
Efficient searching of substring using a rolling hash
