
# Binary Search — Day 5

## What Is Binary Search?

Binary Search is an efficient searching algorithm that repeatedly divides the search range into half.

**Important:** The input array must be sorted.

## Algorithm

1. Initialize `left = 0`.
2. Initialize `right = nums.length - 1`.
3. While `left <= right`:
   - Calculate `mid = left + (right - left) / 2`.
   - If `nums[mid] == target`, return `mid`.
   - If `nums[mid] < target`, search the right half by setting `left = mid + 1`.
   - Otherwise, search the left half by setting `right = mid - 1`.
4. If the target is not found, return `-1`.

## Complexity

- Time Complexity: O(log n)
- Auxiliary Space: O(1) for the iterative approach.

## Important Edge Cases

- Target is the first element.
- Target is the last element.
- Target is absent.
- Array contains one element.
- Array is empty.

## Day 5 Learning

- [x] Understand Binary Search.
- [x] Implement iterative Binary Search.
- [x] Understand how the search range shrinks.
- [x] Practice LeetCode #35 — Search Insert Position.
