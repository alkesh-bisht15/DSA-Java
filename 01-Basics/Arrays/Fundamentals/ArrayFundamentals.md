# Array Fundamentals

This section contains the concepts learned during DSA Day 2.

## Array Operations

### Access

Accessing an element using its index:

```java
int value = numbers[i];
```
Time Complexity: O(1)

Because an array provides direct access using an index.

### Searching

Linear search checks elements one by one.

Time Complexity: O(n)

### Insertion

Inserting an element into the middle of an array may require
shifting existing elements.

Time Complexity: O(n)

Insertion at the end can be O(1) when capacity is available,
but for a fixed-size Java array, insertion requires creating or
managing another array.

### Deletion

Deleting an element from the middle may require shifting elements
to fill the gap.

Time Complexity: O(n)

### In-Place Operations

An in-place operation modifies the existing data structure instead
of creating another data structure proportional to the input size.

Example:
```java
int temp = numbers[i];
numbers[i] = numbers[j];
numbers[j] = temp;
```
If only a constant number of variables are used:
Space Complexity: O(1)

### Extra Space

Extra space refers to additional memory used by an algorithm apart
from the input.

Example:
```java
int[] copy = new int[n];
```
This requires: O(n) extra space.

### Running Sum

A running sum maintains the accumulated sum while traversing an array.

Example:
```java
int sum = 0;

for (int number : numbers) {
    sum += number;
}
```
Time Complexity: O(n)
Space Complexity: O(1)

### Prefix Sum / Range Sum

A prefix sum stores cumulative sums of the elements.

For:

[5, 10, 15, 20]

The prefix sum is:

[5, 15, 30, 50]

Once the prefix sum is created, a range sum can be calculated using
the prefix values instead of traversing the entire range again.

For a range from index left to right:

rangeSum = prefix[right] - prefix[left - 1]

For left = 0, the calculation is:

rangeSum = prefix[right]

#### Complexity
Building the prefix sum:
Time: O(n)
Space: O(n)
After preprocessing, a range-sum query can be answered in: O(1)
This is useful when an array has many range-sum queries.

### Two Pointer Technique

Two pointers is a problem-solving technique where two indices are
used to traverse or process an array.

The pointers are often called:

1. left
2. right

A common starting position is:

left → beginning of array
right → end of array

Example:
```java
int left = 0;
int right = numbers.length - 1;

while (left < right) {

    // process numbers[left] and numbers[right]

    left++;
    right--;
}
```
Instead of using nested loops, two pointers can sometimes solve a problem with a single traversal.

#### General idea

[ 1  2  3  4  5  6 ]
  ↑                 ↑
left              right

The pointers move according to the requirements of the problem.

#### Benefits

Two pointers can often:

Reduce nested-loop solutions
Avoid unnecessary extra arrays
Allow in-place modification
Reduce time complexity from O(n²) to O(n)

Two pointers are especially common in:

Sorted arrays
Searching for pairs
Removing elements
Reordering arrays
Comparing elements from both ends

### Remove Duplicates from a Sorted Array

For a sorted array, duplicate values appear next to each other.

Example:

[1, 1, 2, 2, 3, 3]

The goal is to keep only one occurrence of each value.

A two-pointer approach can be used.

One pointer keeps track of the position where the next unique
element should be placed, while another pointer scans the array.

#### Example:

[1, 1, 2, 2, 3, 3]
 ↑
slow

   ↑
  fast

When a new unique element is found, it is placed at the next
available position.

#### Complexity

Time Complexity: O(n)
Space Complexity: O(1)
The array is modified in-place.

### Move Zeroes

The goal is to move all zeroes to the end of the array while
maintaining the relative order of the non-zero elements.

#### Example:

Before:
[0, 1, 0, 3, 12]

After:
[1, 3, 12, 0, 0]

A two-pointer approach can be used.

One pointer keeps track of the position where the next non-zero
element should be placed.

The other pointer scans the array.

#### Important requirement

The relative order of the non-zero elements should remain unchanged.

#### Complexity

Time Complexity: O(n)

Space Complexity: O(1)

This is an in-place array operation.

### Move Negatives

The goal is to rearrange an array so that negative elements are moved
to one side of the array.

#### Example:

Before:
[2, -3, 5, -1, 4, -6]

After:
[-3, -1, -6, 2, 5, 4]

A two-pointer or partition-style approach can be used to rearrange
the elements.

The exact arrangement of the positive elements depends on the
implementation and whether preserving their relative order is
required.

#### Complexity

A typical in-place partition approach:

Time Complexity: O(n)
Space Complexity: O(1)

### Count Positive and Negative Numbers

The array can be traversed once while maintaining separate counters.

Example:

[5, -2, 0, 7, -4, 8]

Result:

Positive: 3
Negative: 2
Zero: 1

The algorithm checks each element:

if number > 0
    positive++

else if number < 0
    negative++

else
    zero++

#### Complexity

Time Complexity: O(n)
Space Complexity: O(1)

### Two Sum

The Two Sum problem asks us to find two elements whose sum equals
a given target.

Example:

Array:
[2, 7, 11, 15]

Target:
9

The answer is:

2 + 7 = 9

#### Basic Approach

For each element, check the remaining elements to find a pair that
adds up to the target.

This approach uses nested loops.

Time Complexity: O(n²)

Space Complexity: O(1)

#### Important

There are optimized approaches using a HashMap that can reduce the
time complexity to O(n).

However, the HashMap-based approach is intentionally deferred for
later in this learning journey.

The focus at this stage is understanding the array-based brute-force
solution and the problem-solving process.

---

## Important Patterns Learned

The major patterns learned in Array Fundamentals are:

### Pattern 1: Single Array Traversal

Process every element once.

Time: O(n)
Space: O(1)

Examples:

Find Maximum
Find Minimum
Count Occurrences
Array Sum
Count Positive/Negative

### Pattern 2: Two Pointers

Use two indices to process an array efficiently.

Time: Usually O(n)
Space: Usually O(1)

Examples:

Remove Duplicates
Move Zeroes
Move Negatives
Two Sum with suitable array conditions

### Pattern 3: Prefix Sum

Precompute cumulative values to answer repeated range-sum queries
efficiently.

Build Prefix Sum:
Time: O(n)
Space: O(n)

Range Query:
Time: O(1)

### Key Takeaways

Array access by index is O(1).
Traversing an array once is O(n).
Nested loops often lead to O(n²).
In-place algorithms can reduce extra space to O(1).
Two pointers can eliminate unnecessary nested loops in many problems.
Prefix sums trade O(n) preprocessing and space for O(1) range queries.
Always analyze both time and space complexity.
Understand the brute-force approach before learning optimized techniques.