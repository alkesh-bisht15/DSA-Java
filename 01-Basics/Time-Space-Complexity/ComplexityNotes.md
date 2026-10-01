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