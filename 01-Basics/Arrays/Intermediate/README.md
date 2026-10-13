
# Day 3 — Intermediate Array Problems

This section contains array problems that build on basic traversal and introduce more problem-solving techniques.

## Problems Completed

| # | Problem | Approach | Time Complexity | Auxiliary Space |
|---:|---|---|---|---|
| 1 | Missing Number | Sum formula | O(n) | O(1) |
| 2 | Find Duplicate | Nested loops | O(n²) | O(1) |
| 3 | Frequency of an Element | Single traversal | O(n) | O(1) |
| 4 | Rotate Array by One | Shift elements | O(n) | O(1) |
| 5 | Rotate Array by K | Repeated rotation | O(n × k) | O(1) |
| 6 | Rotate Array by K — Optimized | Reversal technique | O(n) | O(1) |
| 7 | Intersection of Two Arrays | Compare elements across arrays | O(n × m) | Depends on result storage |
| 8 | Merge Two Sorted Arrays | Three-pointer merge | O(n + m) | O(n + m) |

Here, `n` and `m` represent the lengths of the input arrays. The repeated-rotation complexity assumes each rotation shifts the array in linear time.

## Concepts Practiced

- Finding a missing number using the expected sum.
- Detecting duplicate elements with nested loops.
- Counting the frequency of a target element.
- Rotating an array to the right by one position.
- Rotating an array by `k` positions.
- Optimizing rotation using the reversal technique.
- Finding common elements between two arrays.
- Merging two sorted arrays using pointers.

## Important Notes

### Optimized Array Rotation

The reversal approach performs three reversals:

1. Reverse the entire array.
2. Reverse the first `k` elements.
3. Reverse the remaining elements.

Before rotating, reduce `k` using `k % n`. Handle an empty array before performing modulo. This solution takes O(n) time and O(1) auxiliary space.

### Intersection of Two Arrays

The comparison-based approach checks elements from one array against elements from the other. The exact complexity and whether duplicate results are included depend on the implementation.

### Merge Two Sorted Arrays

The merge approach uses pointers to compare the current elements of both sorted arrays and place the smaller element into the result. Remaining elements are then copied into the result.

For arrays of lengths `n` and `m`, the merge takes O(n + m) time. The returned result array requires O(n + m) space.

## Day 3 Status

- [x] Missing Number
- [x] Find Duplicate
- [x] Frequency of an Element
- [x] Rotate Array by One
- [x] Rotate Array by K
- [x] Rotate Array by K — Optimized Reversal Technique
- [x] Intersection of Two Arrays
- [x] Merge Two Sorted Arrays

All eight Day 3 problems have been completed.


## Day 4 — Array Problem Solving

### Problems Completed

| # | Problem | Main Concept |
|---:|---|---|
| 1 | Left Rotate Array by One | Element shifting |
| 2 | Left Rotate Array by K | Rotation and modulo |
| 3 | Union of Arrays | Combining unique elements |
| 4 | Best Time to Buy and Sell Stock | Single-pass optimization |
| 5 | Maximum Consecutive Ones | Counting consecutive elements |

### Concepts Practiced

- Left rotation by one position.
- Left rotation by `k` positions.
- Using `k % n` to avoid unnecessary rotations.
- Finding unique elements across arrays.
- Tracking minimum prices and maximum profit.
- Counting consecutive ones in a binary array.
- Improving problem-solving through traversal and pointer techniques.

### Day 4 Status

- [x] Left Rotate Array by One
- [x] Left Rotate Array by K
- [x] Union of Arrays
- [x] Best Time to Buy and Sell Stock
- [x] Maximum Consecutive Ones

**Day 4: Completed**
