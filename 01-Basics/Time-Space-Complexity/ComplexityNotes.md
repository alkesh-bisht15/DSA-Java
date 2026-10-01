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