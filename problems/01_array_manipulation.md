# Array Manipulation — Practice Set

Concepts to know before starting: declaring/initializing arrays (`int[]`, `Integer[]`,
`new int[n]`, array literals), `arr.length` (no parentheses), two-pointer technique,
running state (max/min/sum), in-place modification, `Arrays.sort()`, `Arrays.toString()`.

Each question: input → output. Try to solve WITHOUT extra arrays where stated.
Multi-step questions combine 2-3 operations — these are the ones that catch people off guard.

---

## Level 1 — Single Operation

**1.** `[5,3,8,1,9,2]` → sorted ascending → `[1,2,3,5,8,9]`

**2.** `[1,2,3,4,5]` → reversed in place → `[5,4,3,2,1]`

**3.** `[4,2,7,1,9,3]` → max and min in a single pass → `9, 1`

**4.** `[1,2,3,4,5,6,7,8,9,10]` → sum of all elements → `55`

**5.** `[3,7,2,9,4,1]` → count of elements greater than `4` → `2`

**6.** `[1,0,1,0,1,1,0]` → count of 1s and 0s → `4, 3`

**7.** `[10,20,30,40,50]`, index = `2` → remove element at that index, shift left, last position becomes `0` → `[10,20,40,50,0]`

**8.** `[1,2,3,0]` (size 4, last slot empty), insert `99` at index `1`, shifting rest right → `[1,99,2,3]`

---

## Level 2 — Two-Step Combinations

**9.** `[5,1,4,2,8]` → first sort ascending, then reverse it → `[8,5,4,2,1]`
(Don't shortcut by sorting descending directly — practice both steps explicitly, since interviewers sometimes ask for the intermediate state)

**10.** `[12,5,8,21,3,17,9]` → find the 2nd largest element WITHOUT sorting → `17`
(Track two variables: largest and secondLargest, update both correctly in one pass)

**11.** `[1,2,3,4,5,6,7,8,9]` → split into two arrays: first half and second half (if odd length, middle goes to first half) → `[1,2,3,4,5]` and `[6,7,8,9]`

**12.** `[3,6,1,8,2,9,4]` → find the element closest to the average of the array
- Average = (3+6+1+8+2+9+4)/7 ≈ 4.71
- Closest element → `4`

**13.** `[1,2,3,4,5]`, k=2 → rotate LEFT by k positions, in place, O(1) extra space (use the reversal trick: reverse first k, reverse rest, reverse whole)
→ `[3,4,5,1,2]`

**14.** `[2,4,6,8,10,12]` → replace each element with the sum of itself and all elements before it (running/prefix sum, in place)
→ `[2,6,12,20,30,42]`

**15.** `[7,1,5,3,6,4]` → find the maximum difference `arr[j]-arr[i]` where `j > i` (best time to buy/sell, single pass tracking min-so-far)
→ `5` (buy at 1, sell at 6)

---

## Level 3 — Heavy Multi-Step Manipulation

**16.** `[4,2,2,8,3,3,1]`
- Step 1: Remove duplicates (keep first occurrence order)
- Step 2: Sort the result descending
- Step 3: Return sum of top 2 elements
→ Unique: `[4,2,8,3,1]` → sorted desc: `[8,4,3,2,1]` → top 2 sum = `12`

**17.** `[1,-2,3,-4,5,-6,7,-8]`
- Step 1: Separate into positives and negatives (two new arrays allowed here — output shape differs from input)
- Step 2: Sort positives ascending, negatives descending
- Step 3: Merge alternately: positive, negative, positive, negative...
→ Positives sorted: `[1,3,5,7]`, Negatives sorted desc: `[-2,-4,-6,-8]`
→ Result: `[1,-2,3,-4,5,-6,7,-8]`

**18.** `[3,1,4,1,5,9,2,6,5,3,5]`
- Step 1: Count frequency of each element (HashMap)
- Step 2: Find the element with frequency >= 3
- Step 3: Remove ALL occurrences of that element from the array (in place, track new length)
→ `5` appears 3 times → remove all `5`s → `[3,1,4,1,9,2,6,3]` (new length 8)

**19.** `[5,2,9,1,5,6,7,3,2,4]`
- Step 1: Find the 3rd smallest element (without full sort — use partial selection)
- Step 2: Find how many elements are strictly greater than that 3rd smallest element
→ Sorted view: `[1,2,2,3,4,5,5,6,7,9]` → 3rd smallest = `2` → elements greater than 2 = `7`

**20.** Two arrays: `[1,3,5,7,9]` and `[2,3,6,7,10]`
- Step 1: Find elements common to both (intersection)
- Step 2: Find elements unique to array 1 only
- Step 3: Find elements unique to array 2 only
→ Common: `[3,7]`, Unique to arr1: `[1,5,9]`, Unique to arr2: `[2,6,10]`

**21.** `[1,2,3,4,5,6,7,8,9,10]`
- Step 1: Replace every element at an EVEN index with its square
- Step 2: Replace every element at an ODD index with its cube
- Step 3: Find the new sum of the array
→ Indices 0,2,4,6,8 (even) → square: 1,9,25,49,81
→ Indices 1,3,5,7,9 (odd) → cube: 8,64,216,512,1000
→ Array becomes `[1,8,9,64,25,216,49,512,81,1000]` → sum = `1965`

**22. (Matrix encoded as 1D array)** `[1,2,3,4,5,6,7,8,9,10,11,12]`, treat as a 3x4 grid (row-major)
- Step 1: Find the value at row=1, col=2 using index formula `row*cols + col`
- Step 2: Find the sum of row 2
- Step 3: Find the sum of column 1
→ row=1,col=2 → index `1*4+2=6` → value `7`
→ row 2 = indices 8-11 = `[9,10,11,12]` → sum = `42`
→ column 1 = indices 1,5,9 = `[2,6,10]` → sum = `18`

**23.** `[10,20,30,40,50,60,70,80,90]`
- Step 1: Reverse the array in place
- Step 2: From the reversed array, remove every 3rd element (1-indexed)
- Step 3: Return the final array
→ Reversed: `[90,80,70,60,50,40,30,20,10]`
→ Remove positions 3,6,9 (values 70,40,10): `[90,80,60,50,30,20]`

**24. (Sliding window + frequency)** `[1,2,1,3,2,1,4,2]`, window size = `3`
For each window of size 3, find the element that appears most frequently within that window.
→ Windows: `[1,2,1]→1`, `[2,1,3]→tie`, `[1,3,2]→tie`, `[3,2,1]→tie`, `[2,1,4]→tie`, `[1,4,2]→tie`
(Practice handling ties — state your tie-breaking rule out loud, e.g. "first element with max frequency")

**25.** `[5,7,2,9,4,1,8,3,6]`
- Step 1: Find the average of the array
- Step 2: Without sorting, rearrange the array so all elements less than average come first, then all elements >= average (two-pass, using extra index pointers)
→ avg = 5 → less than 5: `[2,4,1,3]`, >= 5: `[5,7,9,8,6]` → result: `[2,4,1,3,5,7,9,8,6]`

---

## Level 4 — "No Library Shortcuts Allowed" Variants

These restate earlier ideas but forbid `Arrays.sort()`, `Collections`, streams, etc.
Practice writing the manual loop versions — this is what trips people up most.

**26.** `[9,3,7,1,5]` → sort ascending using bubble sort (manual, nested loops, swap logic)

**27.** `[1,2,3,4,5]` → reverse without `Collections.reverse()` or extra array (swap from both ends)

**28.** `[3,1,4,1,5,9,2,6]` → find 2nd largest without sorting, without `Arrays.sort()`

**29.** `[1,2,2,3,3,3,4]` → count frequency of each element WITHOUT HashMap (nested loop counting)

**30.** `[5,2,8,1,9]` → check if array is sorted ascending — single pass, boolean flag, break early if not sorted
