# Array Fundamentals

Concepts, techniques, and problems completed during DSA Day 2.

## 📚 Concepts Learned

### Array Fundamentals

- Array access
- Array searching
- Array insertion
- Array deletion
- In-place operations
- Extra space
- Running sum
- Prefix sum
- Range sum

### Problem-Solving Techniques

- Two Pointer Technique
- In-place array manipulation
- Single-pass array traversal
- Array partitioning

## 🧩 Problems Solved

| Problem | Technique | Time | Space |
|---|---|---:|---:|
| Array Sum | Traversal | O(n) | O(1) |
| Array Average | Traversal | O(n) | O(1) |
| Count Positive & Negative | Traversal | O(n) | O(1) |
| Max-Min Difference | Traversal | O(n) | O(1) |
| Remove Duplicates | Two Pointers | O(n) | O(1) |
| Move Zeroes | Two Pointers | O(n) | O(1) |
| Move Negatives | Two Pointers / Partition | O(n) | O(1) |
| Range Sum | Prefix Sum | O(1)* | O(n) |
| Two Sum | Brute Force | O(n²) | O(1) |

\* O(1) per range query after O(n) prefix-sum preprocessing.

## 🧠 Key Learning

### Single Traversal

Many basic array problems can be solved by traversing the array once.

```text
O(n) Time
O(1) Extra Space
```
### Two Pointers

Two pointers allow us to process arrays efficiently using two indices
instead of unnecessary nested loops.

Usually O(n) Time
Usually O(1) Extra Space

### Prefix Sum

Prefix sums allow repeated range-sum queries to be answered in O(1)
after O(n) preprocessing.