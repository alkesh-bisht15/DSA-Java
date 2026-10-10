# Time and Space Complexity

## Time Complexity

Time complexity describes how the running time of an algorithm grows
as the input size increases.

### Common Complexities

| Complexity | Name |
|---|---|
| O(1) | Constant |
| O(log n) | Logarithmic |
| O(n) | Linear |
| O(n log n) | Linearithmic |
| O(n²) | Quadratic |
| O(2ⁿ) | Exponential |

---

## Examples

### O(1)

```java
int x = numbers[0];
The operation takes constant time regardless of the input size.
```

### O(n)
```java
for (int i = 0; i < n; i++) {
    System.out.println(i);
}
```
The loop runs n times.
Time Complexity: O(n)

### O(n²)
```java
for (int i = 0; i < n; i++) {
    for (int j = 0; j < n; j++) {
        System.out.println(i + " " + j);
    }
}
```

The inner loop runs n times for each of the n outer iterations.
Time Complexity: O(n²)

---

## Space Complexity 

### O(1) Space
```java 
int max = numbers[0];
```

Only a fixed amount of additional memory is used.
Space Complexity: O(1)

### O(n) Space
```java
int[] copy = new int[n];
```

The additional array grows with the input size.
Space Complexity: O(n)

---

## Important Rule

When calculating complexity, focus on how the number of operations
or memory usage grows with input size.

We generally ignore constants and lower-order terms.

Example:
```java
O(2n + 5) → O(n)

O(n² + n) → O(n²)
```
### Now understand why each one has that complexity
Example	            Extra Space	     Why?
constantSpace()	    O(1)	        Only a fixed number of variables
findMax()	        O(1)	        Only max and i; no new structure depending on n
createArray()	    O(n)	        Creates an array containing n elements
createCopy()	    O(n)	        Creates a new array of size n
createMatrix()	    O(n²)	        Creates an n × n matrix

### Important distinction

Look carefully at this:
```java
static void findMax(int[] numbers) {

    int max = numbers[0];

    for (int i = 1; i < numbers.length; i++) {
        ...
    }
}
```
The input array already exists. We aren't creating another array.

Therefore:
Space Complexity = O(1)
Not O(n).

But here:
```java
int[] copy = new int[numbers.length];
```
we create a new array whose size depends on n, so:

Space Complexity = O(n)

This distinction between input space and auxiliary space is very important in DSA.


# Time and Space Complexity — Notes

## 1. Time Complexity

Time complexity describes how an algorithm's running time grows as the input size increases.

| Complexity | Common Example |
|---|---|
| O(1) | Accessing an array element by index |
| O(log n) | Binary search on sorted data |
| O(n) | Traversing an array |
| O(n log n) | Efficient comparison-based sorting |
| O(n²) | Comparing every pair using nested loops |

## 2. Space Complexity

Space complexity describes how memory usage grows with input size.

Auxiliary space refers to the extra working memory used by an algorithm, excluding the input itself.

| Auxiliary Space | Example |
|---|---|
| O(1) | A fixed number of counters or temporary variables |
| O(n) | Creating an additional array proportional to the input |
| O(n) | Storing all input elements in a separate collection |
| O(log n) | Recursive calls with logarithmic recursion depth |

## 3. Nested Loops

Nested loops are not automatically O(n²).

- If both loops iterate proportionally to `n`, the complexity is typically O(n²).
- If the inner loop performs a fixed number of iterations, the total can be O(n).
- If one loop iterates over `n` elements and the other over `m` elements, the complexity can be O(n × m).

## 4. Complexity of Completed Array Problems

| Problem | Time Complexity | Auxiliary Space |
|---|---|---|
| Find Maximum / Minimum | O(n) | O(1) |
| Linear Search | O(n) | O(1) |
| Array Sum / Average | O(n) | O(1) |
| Frequency of an Element | O(n) | O(1) |
| Find Duplicate — nested loops | O(n²) | O(1) |
| Missing Number — sum formula | O(n) | O(1) |
| Rotate Array by K — repeated rotation | O(n × k) | O(1) |
| Rotate Array by K — reversal | O(n) | O(1) |
| Brute-force Two Sum | O(n²) | O(1) |
| Merge Two Sorted Arrays | O(n + m) | O(n + m) for the result array |

For Intersection of Two Arrays, a nested-loop implementation typically takes O(n × m) time. Space complexity depends on how the intersection result is stored and whether additional storage is used.

For Range Sum, building a prefix-sum array takes O(n) time and O(n) space. Each query then takes O(1) time.

## 5. Why Complexity Analysis Matters

Complexity analysis helps compare approaches and understand how they scale.

For example, rotating an array by repeatedly shifting elements takes O(n × k) time, while the reversal technique rotates it in O(n) time.

Both solutions can use O(1) auxiliary space, but the reversal technique is more efficient for large inputs.

## Learning Progress

- [x] Time complexity fundamentals
- [x] Space complexity and auxiliary space
- [x] Array traversal and searching
- [x] Nested-loop analysis
- [x] Prefix-sum preprocessing and queries
- [x] Brute-force versus optimized array approaches
- [x] Reversal-based array rotation
- [x] Merging sorted arrays using pointers
