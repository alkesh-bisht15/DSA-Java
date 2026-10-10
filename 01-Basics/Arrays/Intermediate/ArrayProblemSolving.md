
# Array Problem-Solving Notes

These notes summarize the concepts and approaches practiced while solving intermediate array problems in Java.

## 1. Missing Number

When an array contains distinct numbers from `1` to `n` with one number missing, the expected sum is:

`n * (n + 1) / 2`

Subtract the actual array sum from the expected sum to find the missing number.

- Time Complexity: O(n)
- Auxiliary Space: O(1)

This formula assumes the input follows the stated range and missing-number constraints.

## 2. Finding a Duplicate

A straightforward approach compares each element with the elements that come after it.

- Time Complexity: O(n²)
- Auxiliary Space: O(1)

Nested loops are useful for understanding the problem before learning more advanced techniques.

## 3. Frequency of an Element

Traverse the array once and increase a counter whenever an element equals the target.

- Time Complexity: O(n)
- Auxiliary Space: O(1)

This counts occurrences of one target without requiring a frequency map.

## 4. Rotate Array by One

For a right rotation, save the last element, shift all other elements one position to the right, and place the saved element at index zero.

- Time Complexity: O(n)
- Auxiliary Space: O(1)

## 5. Rotate Array by K — Repeated Rotation

Perform a one-position rotation repeatedly, up to `k` times.

Reduce unnecessary rotations using:

`k = k % n`

For a non-empty array, this avoids repeating a full set of `n` rotations.

- Time Complexity: O(n × k) in the usual repeated-shifting implementation
- Auxiliary Space: O(1)

## 6. Rotate Array by K — Reversal Technique

The optimized method rotates the array to the right:

1. Handle the empty-array case.
2. Set `k = k % n`.
3. Reverse the entire array.
4. Reverse the first `k` elements.
5. Reverse the remaining `n - k` elements.

A helper method can reverse a section using two pointers, one at the start and one at the end. Swap their elements and move both pointers inward until they meet.

- Time Complexity: O(n)
- Auxiliary Space: O(1)

This is more efficient than repeatedly shifting the array.

## 7. Intersection of Two Arrays

The intersection contains elements common to both arrays.

A comparison-based solution checks elements of one array against elements of the other.

- Time Complexity: O(n × m) for a straightforward nested-loop comparison
- Auxiliary Space: Depends on how the result is stored

Important: Decide whether the problem requires unique common values or preserves repeated occurrences. The expected result depends on that requirement.

## 8. Merge Two Sorted Arrays

Two sorted arrays can be merged into one sorted array using three pointers:

- One pointer for the first input array.
- One pointer for the second input array.
- One pointer for the result array.

Compare the current elements, copy the smaller one into the result, and advance the corresponding pointer. When one input array is exhausted, copy the remaining elements from the other.

- Time Complexity: O(n + m)
- Auxiliary Space: O(n + m) when creating a new result array

The input arrays must already be sorted for this approach to produce a sorted result.

## Key Lessons

- Understand the constraints before selecting an algorithm.
- Use simple solutions to establish correctness.
- Apply modulo to avoid redundant rotations.
- Use reversal to optimize array rotation.
- Use multiple pointers when working with sorted arrays.
- Include output storage when analyzing total space, and distinguish it from auxiliary working space.
- Test empty arrays, single-element arrays, repeated values, and boundary values where relevant.
