# Multi-Dimensional Array & Nested List Manipulation — Practice Set

Concepts to know before starting: `int[][]`, `List<List<Integer>>`, `List<List<Object>>`,
`Arrays.asList()` for building rows (creates fixed-size list — wrap in `new ArrayList<>()`
if you need mutability), `grid.length` (rows) vs `grid[i].length` (cols of row i, can vary
for jagged arrays), diagonal access (`grid[i][i]`), boundary/spiral traversal, the
"global counter across nested loops" pattern, `instanceof` for mixed-type lists.

---

## Level 1 — Single Operation

**1.** `[[1,2,3],[4,5,6],[7,8,9]]` → sum of all elements → `45`

**2.** `[[1,2,3],[4,5,6],[7,8,9]]` → print row-wise (normal order): `1,2,3,4,5,6,7,8,9`

**3.** `[[1,2,3],[4,5,6],[7,8,9]]` → print column-wise: `1,4,7,2,5,8,3,6,9`

**4.** `[[1,2,3],[4,5,6],[7,8,9]]` → main diagonal sum (`grid[i][i]`) → `1+5+9=15`

**5.** `[[1,2,3],[4,5,6],[7,8,9]]` → anti-diagonal sum (`grid[i][n-1-i]`) → `3+5+7=15`

**6.** `[[1,2],[3,4],[5,6]]` → count of even numbers in entire grid → `3`

**7.** `[[1,2,3],[4,5],[6,7,8,9]]` (jagged) → find the single largest element across all rows → `9`

**8.** `[[1,2],[3,4]]` → transpose (swap rows/cols) → `[[1,3],[2,4]]`

---

## Level 2 — Two-Step Combinations

**9.** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Find sum of each row
- Step 2: Find which row has the maximum sum
→ Row sums: `6, 15, 24` → max is row index `2`

**10.** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Find sum of each column
- Step 2: Find which column has the minimum sum
→ Column sums: `12, 15, 18` → min is column index `0`

**11.** `[[5,2],[3,4],[5,6]]`
- Step 1: Traverse as a flattened sequence WITHOUT actually creating a new list — just track a global counter
- Step 2: Print every alternate element starting from global index 0 (your original interview question type)
→ Flattened conceptually: `5,2,3,4,5,6` (indices 0-5) → alternate from 0: `5,3,5` (indices 0,2,4)

**12.** `[[1,2],[3,4],[5,6]]`
- Step 1: Reverse each row individually (in place)
- Step 2: Then reverse the order of rows themselves
→ Step 1 result: `[[2,1],[4,3],[6,5]]` → Step 2 result: `[[6,5],[4,3],[2,1]]`

**13.** `[["John",25],["Amy",30],["Raj",22]]`
- Step 1: Extract all ages into a list
- Step 2: Find the name corresponding to the minimum age
→ Ages: `[25,30,22]` → min age `22` → name = `"Raj"`

**14.** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Replace every border element (first/last row, first/last column) with `0`
- Step 2: Sum the remaining (non-border) elements
→ Only `5` is non-border → sum = `5`

---

## Level 3 — Heavy Multi-Step Manipulation

**15. (Spiral traversal — classic)** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Traverse the grid in spiral order (right along top, down the right side, left along bottom, up the left side, then inward)
- Step 2: Print the resulting sequence
→ `1,2,3,6,9,8,7,4,5`

**16.** `[[1,2,3,4],[5,6,7,8],[9,10,11,12]]`
- Step 1: Find the value at row=2, col=1
- Step 2: Find the sum of that row AND that column (without double-counting the shared cell)
→ value = `10`
→ Row 2 sum = `9+10+11+12=42`, Col 1 sum = `2+6+10=18`
→ Combined sum excluding double-count of cell(2,1)=10: `42+18-10=50`

**17. (Mixed-type, your exact interview style)** `[[1,"hi",2],["boy",3,"cat",4],[5,"home"]]`
- Step 1: Treat as a flattened sequence (global index across all rows)
- Step 2: Print elements at global indices `0,3,6` (every 3rd, 0-indexed)
→ Flattened: `1,"hi",2,"boy",3,"cat",4,5,"home"` (indices 0-8)
→ Indices 0,3,6 → `1, "boy", 4`

**18.** `[[2,4,6],[1,3,5],[8,10,12]]`
- Step 1: Find which row contains the maximum element
- Step 2: In that row, find the index of the maximum element
- Step 3: Replace that maximum element with the sum of the entire row (computed before replacement)
→ Max element = `12`, in row index `2`, at column index `2`
→ Row 2 sum (before replacement) = `8+10+12=30` → row becomes `[8,10,30]`

**19. (Heavy — diagonal + frequency)** `[[1,2,1],[3,1,4],[1,5,1]]`
- Step 1: Extract main diagonal elements
- Step 2: Build a frequency map of the WHOLE grid's elements
- Step 3: Check if the most frequent element in the whole grid also appears on the diagonal
→ Diagonal: `[1,1,1]`
→ Whole grid frequency: `1` appears 5 times (most frequent)
→ Does `1` appear on diagonal? → `true`

**20.** `[[1,2,3],[4,5,6],[7,8,9],[10,11,12]]` (4 rows, 3 cols)
- Step 1: Find sum of each row
- Step 2: Find sum of each column
- Step 3: Check if grand total of row-sums equals grand total of column-sums (sanity check pattern)
→ Row sums: `6,15,24,33` → total = `78`
→ Col sums: `22,26,30` → total = `78` → match → `true`

**21. (No merge/copy variant)** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: WITHOUT creating new lists, count how many elements are GREATER than the element directly before them in the flattened sequence (i.e., `flat[i] > flat[i-1]`)
- Step 2: Use a global counter for position tracking, comparing current element to a stored "previous value" variable — not array lookup
→ Flattened: `1,2,3,4,5,6,7,8,9` — every element after the first is greater than the previous → count = `8`

**22. (Heavy — list of lists of different types)** `[[1,2,3],["a","b"],[4.5,5.5,6.5,7.5]]`
- Step 1: For each inner list, determine its type (all Integer, all String, all Double) using `instanceof`
- Step 2: Compute sum for numeric lists only (skip String lists)
- Step 3: Return total sum across all numeric lists
→ List 0 (Integer): sum=6, List 1 (String): skip, List 2 (Double): sum=24.0
→ Total = `30.0`

**23.** `[[5,1,4],[2,8,3],[9,6,7]]`
- Step 1: Find the 2nd largest element in EACH row
- Step 2: Sum these 2nd-largest values across all rows
→ Row 0: `[5,1,4]` 2nd largest = `4`
→ Row 1: `[2,8,3]` 2nd largest = `3`
→ Row 2: `[9,6,7]` 2nd largest = `7`
→ Sum = `4+3+7=14`

**24. (Heavy — boundary + interior)** `[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]`
- Step 1: Sum of all BORDER elements (first/last row, first/last column)
- Step 2: Sum of all INTERIOR elements
- Step 3: Verify border sum + interior sum = total sum
→ Total = `136`
→ Interior elements: `6,7,10,11` → interior sum = `34`
→ Border sum = `136-34=102` → verify: `102+34=136` ✓

**25. (Very heavy — combines patterns)** `[[3,"apple",1],["banana",2,4],[5,"cherry",6]]`
- Step 1: Separate all numeric values and all string values (traverse once, classify with `instanceof`)
- Step 2: Find sum of numeric values
- Step 3: Find the alphabetically first string value
- Step 4: Find the global (flattened) index of that alphabetically-first string
→ Numeric: `[3,1,2,4,5,6]` sum = `21`
→ Strings: `[apple, banana, cherry]` → alphabetically first = `"apple"`
→ Flattened sequence: `3,"apple",1,"banana",2,4,5,"cherry",6` → "apple" is at global index `1`

---

## Level 4 — "No Library Shortcuts / In-Place Only" Variants

**26.** `[[1,2],[3,4],[5,6]]` → transpose to `[[1,3,5],[2,4,6]]` — discuss why this CANNOT be done truly in-place for non-square matrices (output shape differs), and what minimal extra space is justified

**27.** `[[1,2,3],[4,5,6],[7,8,9]]` → rotate the entire matrix 90 degrees clockwise IN PLACE (square matrix — possible via layer-by-layer rotation) → `[[7,4,1],[8,5,2],[9,6,3]]`

**28.** `[[1,2,3],[4,5,6],[7,8,9]]` → print spiral order WITHOUT a separate result list — print each element as visited, using four boundary pointers (top, bottom, left, right)

**29.** `[[1,"hi"],["boy",2,3],[4,"home"]]` → reproduce your original interview question: print every alternate element (global index 0,2,4,6...) using ONLY a counter variable, no flattening into a new list

**30.** `[[1,2,3],[4,5,6],[7,8,9]]` → check if the matrix is "symmetric" (`grid[i][j] == grid[j][i]` for all i,j) WITHOUT computing the transpose — compare cells directly in nested loops
