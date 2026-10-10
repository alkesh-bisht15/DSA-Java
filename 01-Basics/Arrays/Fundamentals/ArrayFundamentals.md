
# Array Fundamentals — Theory Notes

## 1. What Is an Array?

An array stores multiple elements of the same data type in an indexed collection.

In Java, array indexing starts at `0`, and the length is available through the `length` property.

```java
int[] numbers = {10, 20, 30, 40};
System.out.println(numbers[0]); // 10
System.out.println(numbers.length); // 4
```

## 2. Common Array Operation Complexities

| Operation | Typical Time Complexity |
|---|---|
| Access by index | O(1) |
| Linear search | O(n) |
| Insert at an arbitrary position | O(n) |
| Delete at an arbitrary position | O(n) |
| Traverse the array | O(n) |

Insertion and deletion can require shifting elements. These complexities assume a standard fixed-size Java array.

## 3. In-Place Operations

An in-place operation modifies the original array instead of creating another array for the transformed result.

Examples include swapping elements, reversing an array using two pointers, and moving elements using a position pointer.

In-place algorithms often use O(1) auxiliary space, excluding the input array and any output required by the problem.

## 4. Running Sum and Array Average

A running sum accumulates values as the array is traversed.

The average is calculated by dividing the sum by the number of elements. An empty array must be handled before dividing by its length.

- Time Complexity: O(n)
- Auxiliary Space: O(1)

## 5. Counting Elements

A counter can track how many elements satisfy a condition, such as being positive, negative, zero, or equal to a target.

A single traversal takes O(n) time and O(1) auxiliary space when maintaining a fixed number of counters.

## 6. Two-Pointer Technique

The two-pointer technique uses two indices to solve a problem efficiently.

Examples:

- One pointer tracks the next position for a valid element.
- Two pointers move inward to reverse an array.
- Two pointers traverse two sorted arrays during a merge.

The correct pointer movement depends on the problem's constraints.

## 7. Removing Duplicates from a Sorted Array

For a sorted array, a position pointer can track where the next unique element belongs.

When a new value differs from the previous unique value, write it at the next valid position.

This approach can run in O(n) time and O(1) auxiliary space when modifying the original array.

## 8. Moving Zeroes

The goal is to move zeroes to the end while preserving the relative order of non-zero elements.

A position pointer can track where the next non-zero value should be written. Depending on the implementation, the remaining positions are then filled with zeroes.

- Time Complexity: O(n)
- Auxiliary Space: O(1)

## 9. Moving Negative Elements

A partition-style approach places negative elements on one side and non-negative elements on the other.

If the problem does not require preserving the original order, swapping elements can be used to partition the array in place.

- Typical Time Complexity: O(n)
- Auxiliary Space: O(1)

## 10. Prefix Sums

A prefix-sum array stores cumulative totals.

For an array `numbers`, the prefix sum at index `i` represents the sum from index `0` through index `i`.

A range sum from index `left` to index `right`, inclusive, can be calculated using:

`prefix[right] - prefix[left - 1]`

When `left == 0`, use `prefix[right]` directly.

- Preprocessing Time: O(n)
- Prefix Array Space: O(n)
- Each Range-Sum Query: O(1)

## 11. Two Sum — Brute Force

The brute-force solution checks every possible pair of elements until it finds a pair whose sum equals the target.

- Time Complexity: O(n²)
- Auxiliary Space: O(1)

The optimized HashMap-based solution is intentionally postponed until the planned hashing section.

## 12. Connection to Intermediate Array Problems

The fundamentals in this section support the next stage of practice:

- Traversal and accumulation → Missing Number and Frequency of an Element.
- Nested loops → Find Duplicate and Intersection of Two Arrays.
- Shifting and swapping → Array Rotation.
- Two pointers → Optimized Array Rotation and Merge Two Sorted Arrays.

## Day 2 Completion

The foundational array problems and concepts have been completed. Continue to the `Intermediate/` folder for the next set of problems.
