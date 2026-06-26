# Java Interview — All 120 Practice Problems
### Arrays | Strings | HashMap | Multi-Dimensional
---

# ═══════════════════════════════════════
# SECTION 1 — ARRAY MANIPULATION (Q1–Q30)
# ═══════════════════════════════════════

**Key syntax reminders:**
- `int[] arr = {1,2,3}` — declare with literal
- `new int[5]` — declare with size, default 0
- `arr.length` — NO parentheses (not a method)
- `Arrays.sort(arr)` — sorts in place
- `Arrays.toString(arr)` — for printing

---

## Level 1 — Single Operation

**Q1.** `[5,3,8,1,9,2]` → sort ascending → `[1,2,3,5,8,9]`

**Q2.** `[1,2,3,4,5]` → reverse in place → `[5,4,3,2,1]`

**Q3.** `[4,2,7,1,9,3]` → find max AND min in a single pass → `9, 1`

**Q4.** `[1,2,3,4,5,6,7,8,9,10]` → sum of all elements → `55`

**Q5.** `[3,7,2,9,4,1]` → count elements greater than `4` → `2`

**Q6.** `[1,0,1,0,1,1,0]` → count of 1s and 0s separately → `4, 3`

**Q7.** `[10,20,30,40,50]`, index=2 → remove element, shift left, last slot = 0 → `[10,20,40,50,0]`

**Q8.** `[1,2,3,0]` (size 4, last slot empty) → insert `99` at index 1, shift rest right → `[1,99,2,3]`

---

## Level 2 — Two-Step Combinations

**Q9.** `[5,1,4,2,8]` → sort ascending THEN reverse (do both steps explicitly) → `[8,5,4,2,1]`

**Q10.** `[12,5,8,21,3,17,9]` → find 2nd largest WITHOUT sorting (track two variables in one pass) → `17`

**Q11.** `[1,2,3,4,5,6,7,8,9]` → split into two halves; odd length: middle goes to first half → `[1,2,3,4,5]` and `[6,7,8,9]`

**Q12.** `[3,6,1,8,2,9,4]` → find element closest to the average
- avg = (3+6+1+8+2+9+4)/7 ≈ 4.71 → closest = `4`

**Q13.** `[1,2,3,4,5]`, k=2 → rotate LEFT by k in place using reversal trick → `[3,4,5,1,2]`

**Q14.** `[2,4,6,8,10,12]` → replace each element with running prefix sum (in place) → `[2,6,12,20,30,42]`

**Q15.** `[7,1,5,3,6,4]` → find max difference `arr[j]-arr[i]` where j>i (track min-so-far) → `5` (buy@1, sell@6)

---

## Level 3 — Heavy Multi-Step

**Q16.** `[4,2,2,8,3,3,1]`
- Step 1: Remove duplicates (keep first-occurrence order)
- Step 2: Sort descending
- Step 3: Return sum of top 2 elements
→ Unique: `[4,2,8,3,1]` → desc: `[8,4,3,2,1]` → top 2 sum = `12`

**Q17.** `[1,-2,3,-4,5,-6,7,-8]`
- Step 1: Separate positives and negatives into two arrays
- Step 2: Sort positives ascending, negatives descending
- Step 3: Merge alternately: positive, negative, positive...
→ Positives: `[1,3,5,7]` Negatives: `[-2,-4,-6,-8]` → Result: `[1,-2,3,-4,5,-6,7,-8]`

**Q18.** `[3,1,4,1,5,9,2,6,5,3,5]`
- Step 1: Count frequency of each element using HashMap
- Step 2: Find element with frequency >= 3
- Step 3: Remove ALL its occurrences in place, track new length
→ `5` appears 3 times → result: `[3,1,4,1,9,2,6,3]` new length = `8`

**Q19.** `[5,2,9,1,5,6,7,3,2,4]`
- Step 1: Find 3rd smallest element without full sort
- Step 2: Count elements strictly greater than it
→ Sorted view: `[1,2,2,3,4,5,5,6,7,9]` → 3rd smallest = `2` → greater than 2 = `7`

**Q20.** Arrays: `[1,3,5,7,9]` and `[2,3,6,7,10]`
- Step 1: Find elements common to both (intersection)
- Step 2: Elements unique to array 1 only
- Step 3: Elements unique to array 2 only
→ Common: `[3,7]` | Only arr1: `[1,5,9]` | Only arr2: `[2,6,10]`

**Q21.** `[1,2,3,4,5,6,7,8,9,10]`
- Step 1: Even index → replace with its square
- Step 2: Odd index → replace with its cube
- Step 3: Find new sum
→ Array: `[1,8,9,64,25,216,49,512,81,1000]` → sum = `1965`

**Q22.** `[1,2,3,4,5,6,7,8,9,10,11,12]` treated as 3×4 grid (row-major)
- Step 1: Value at row=1, col=2 using formula `row*cols+col`
- Step 2: Sum of row 2
- Step 3: Sum of column 1
→ Index = `1*4+2=6` → value=`7` | Row2 sum=`42` | Col1 sum=`18`

**Q23.** `[10,20,30,40,50,60,70,80,90]`
- Step 1: Reverse in place
- Step 2: Remove every 3rd element (1-indexed) from reversed array
→ Reversed: `[90,80,70,60,50,40,30,20,10]` → remove pos 3,6,9 (70,40,10) → `[90,80,60,50,30,20]`

**Q24.** `[1,2,1,3,2,1,4,2]`, window size=3
- For each window of size 3, find most frequent element
- Handle ties: state your tie-breaking rule out loud before coding
→ Windows: `[1,2,1]→1`, `[2,1,3]→tie`, `[1,3,2]→tie`... practice the tie-handling logic

**Q25.** `[5,7,2,9,4,1,8,3,6]`
- Step 1: Find the average
- Step 2: Without sorting, rearrange: elements < avg first, then elements >= avg
→ avg=5 → `[2,4,1,3,5,7,9,8,6]`

---

## Level 4 — No Library Shortcuts Allowed

**Q26.** `[9,3,7,1,5]` → bubble sort manually (nested loops + swap logic)

**Q27.** `[1,2,3,4,5]` → reverse WITHOUT `Collections.reverse()` — swap from both ends

**Q28.** `[3,1,4,1,5,9,2,6]` → find 2nd largest WITHOUT `Arrays.sort()`

**Q29.** `[1,2,2,3,3,3,4]` → frequency count WITHOUT HashMap — nested loop counting

**Q30.** `[5,2,8,1,9]` → check if sorted ascending — single pass, boolean flag, break early if not


# ═══════════════════════════════════════
# SECTION 2 — STRING MANIPULATION (Q31–Q60)
# ═══════════════════════════════════════

**Key syntax reminders:**
- Strings are IMMUTABLE — every "change" creates a new String
- Use `StringBuilder` for heavy modification
- `s.charAt(i)` — get char at index
- `s.substring(start, end)` — end is EXCLUSIVE
- `s.toCharArray()` — convert to char array
- `Character.isDigit(c)` / `Character.isLetter(c)` / `Character.isUpperCase(c)`
- `(int) c` — char to ASCII | `(char)(code)` — ASCII to char
- `s.split(" ")` — split by space
- `s.trim()` — remove leading/trailing spaces

---

## Level 1 — Single Operation

**Q31.** `"hello"` → `"olleh"` — practice 3 ways: StringBuilder, char array swap, recursion

**Q32.** `"racecar"` → palindrome check → `true`

**Q33.** `"Hello World"` → count vowels → `3` (e, o, o)

**Q34.** `"programming"` → character frequency map → `{p:1,r:2,o:1,g:2,a:1,m:2,i:1,n:1}`

**Q35.** `"Hello"` → swap case of every character → `"hELLO"`

**Q36.** `"  hello world  "` → trim + collapse internal spaces → `"hello world"`

**Q37.** `"abcabcbb"` → length of longest substring without repeating characters → `3`

**Q38.** `"aabbccdde"` → first non-repeating character → `'e'`

**Q39.** `"listen"`, `"silent"` → anagram check → `true`

**Q40.** `"Hello123World456"` → separate into letters-only and digits-only → `"HelloWorld"`, `"123456"`

---

## Level 2 — Two-Step Combinations

**Q41.** `"the quick brown fox jumps"`
- Step 1: Split into words
- Step 2: Reverse word order
→ `"jumps fox brown quick the"`

**Q42.** `"the quick brown fox"`
- Step 1: Reverse each word individually
- Step 2: Keep word order same
→ `"eht kciuq nworb xof"`

**Q43.** `"aaabbbcc"`
- Step 1: Run-length encode (count consecutive repeats)
- Step 2: Return as string
→ `"a3b3c2"`

**Q44.** `"a3b3c2"` → decode → `"aaabbbcc"`

**Q45.** `"Programming in Java"`
- Step 1: Count total characters excluding spaces
- Step 2: Count total words
- Step 3: Find longest word
→ chars=`17`, words=`3`, longest=`"Programming"`

**Q46.** `"interviewpreparation"`
- Step 1: Build frequency map
- Step 2: Find all characters with frequency > 1
- Step 3: Sort those characters alphabetically, join into string
→ Compute the map carefully before answering

---

## Level 3 — Heavy Multi-Step

**Q47.** `"Hello World 123 Foo Bar 456"`
- Step 1: Extract all numbers as integers
- Step 2: Sum them
- Step 3: Replace each number in string with `"#"`
→ Numbers: `[123,456]`, sum=`579`, result: `"Hello World # Foo Bar #"`

**Q48.** `"madam arora teaches malayalam"`
- Step 1: Remove all spaces
- Step 2: Check if palindrome
→ Compute carefully — do not assume the answer

**Q49.** `"aabbbccccd"`
- Step 1: Find character with maximum frequency
- Step 2: Find character(s) with minimum frequency
- Step 3: Remove ALL occurrences of max-frequency char
→ Max=`'c'`(4 times) → result: `"aabbbd"`

**Q50.** `"This is a Test String for Practice"`
- Step 1: Convert to lowercase
- Step 2: Build word frequency map
- Step 3: Check if any word appears more than once
→ All words unique → `false`

**Q51.** `"abcdefcba"`
- Step 1: Compare each char with its mirror position
- Step 2: Count mismatches
- Step 3: "Almost palindrome" if mismatches <= 1
→ Mismatch at d vs f → count=1 → `true`

**Q52.** `"aaaabbbcc dd eeeee"`
- Step 1: Split by spaces into words
- Step 2: Run-length encode each word
- Step 3: Join encoded words back with spaces
→ `"a4b3c2 d2 e5"`

**Q53.** `"abcabcbb"`
- Step 1: Find the actual longest no-repeat substring (not just length)
- Step 2: Find its starting index
→ `"abc"`, starts at index `0`

**Q54.** `"Mississippi"`
- Step 1: Build frequency map (case-sensitive)
- Step 2: Find chars appearing an EVEN number of times
- Step 3: Concatenate in order of first appearance
→ Compute counts carefully: M:1, i:4, s:4, p:2

**Q55.** `"abcdef"` and `"defabc"`
- Step 1: Manually check if string2 is a rotation of string1 (no `contains` shortcut)
- Step 2: If yes, find rotation offset
→ rotation=`true`, offset=`3`

---

## Level 4 — No Library Shortcuts Allowed

**Q56.** Reverse `"Hello"` WITHOUT `StringBuilder.reverse()` — char array + manual swap loop only

**Q57.** Palindrome check for `"racecar"` WITHOUT `StringBuilder` — pure two-pointer on `charAt()`

**Q58.** Frequency count for `"aabbccddeeff"` WITHOUT HashMap — use `int[26]` array indexed by `(char - 'a')`

**Q59.** Capitalize first letter of each word in `"hello world"` WITHOUT `split()` — manual char scan, track "start of word" state

**Q60.** Longest no-repeat substring for `"abcabcbb"` WITHOUT HashSet/HashMap — use `boolean[256]` array for "seen" characters


# ═══════════════════════════════════════
# SECTION 3 — HASHMAP MANIPULATION (Q61–Q90)
# ═══════════════════════════════════════

**Key syntax reminders:**
- `Map<String,Integer> map = new HashMap<>()`
- `map.put(key, value)` — add/update
- `map.get(key)` — returns null if not found
- `map.getOrDefault(key, 0)` — safe get with default
- `map.containsKey(key)` — check existence
- `map.remove(key)` — delete entry
- Iterate: `for (Map.Entry<K,V> e : map.entrySet())`
- Frequency pattern: `map.put(k, map.getOrDefault(k,0)+1)`
- `LinkedHashMap` — preserves insertion order
- `TreeMap` — sorted by key automatically

---

## Level 1 — Single Operation

**Q61.** `["a","b","a","c","b","a"]` → build frequency map → `{a:3, b:2, c:1}`

**Q62.** `{"apple":50,"banana":20,"cherry":80}` → key with maximum value → `"cherry"`

**Q63.** `[1,2,3,1,2,1]` → find element appearing exactly 3 times → `1`

**Q64.** `["apple","banana","apple","cherry","banana","apple"]` → distinct elements only → `[apple,banana,cherry]`

**Q65.** `{"math":80,"science":90,"english":70}` → average of all values → `80.0`

**Q66.** `[1,2,3,4,5]` and `[3,4,5,6,7]` → find intersection using HashSet → `[3,4,5]`

**Q67.** `[10,20,10,30,20,10]` → sum of UNIQUE elements (each counted once) → `60`

**Q68.** `["apple","apt","bat","bad","ape"]` → group words by first letter → `{a:[apple,apt,ape], b:[bat,bad]}`

---

## Level 2 — Two-Step Combinations

**Q69.** `["red","blue","red","green","blue","red","yellow"]`
- Step 1: Build frequency map
- Step 2: Find element with LOWEST frequency
→ red:3, blue:2, green:1, yellow:1 → tie between green and yellow — state your rule

**Q70.** `[1,2,3,4,5,6,7,8,9,10]`
- Step 1: Map each number to boolean isEven
- Step 2: Count entries with value `true`
→ `5`

**Q71.** `{"Alice":85,"Bob":92,"Charlie":78,"David":92}`
- Step 1: Find maximum score
- Step 2: Find ALL names with that score (handle ties)
→ Max=`92` → `[Bob, David]`

**Q72.** `[5,3,5,2,3,5,1,2,5]`
- Step 1: Build frequency map
- Step 2: Sort by frequency descending, print "value: frequency"
→ `5:4` is highest — compute the rest yourself

**Q73.** `["cat","dog","cat","bird","dog","cat","fish"]`
- Step 1: Build frequency map
- Step 2: Build reverse map: `frequency → List<word>`
→ `{3:[cat], 2:[dog], 1:[bird,fish]}`

**Q74.** `{"a":1,"b":2,"c":3,"d":4,"e":5}`
- Step 1: Filter entries where value is even
- Step 2: Sum those values
→ b=2, d=4 → sum=`6`

---

## Level 3 — Heavy Multi-Step

**Q75.** `["apple","banana","apple","orange","banana","apple","grape","orange"]`
- Step 1: Frequency map
- Step 2: Sort by frequency desc; ties → alphabetical
- Step 3: Print top 2 with counts
→ apple:3, banana:2, orange:2, grape:1 → Top 2: `apple:3, banana:2`

**Q76.** `[1,2,3,2,1,4,5,4,4,6]`
- Step 1: Frequency map
- Step 2: Group into: appears-once vs appears-more-than-once
- Step 3: Sum each group
→ Once: `[3,5,6]` sum=`14` | More: `[1,2,4]` sum=`7`

**Q77.** Map A: `{"a":1,"b":2,"c":3}` | Map B: `{"b":5,"c":3,"d":4}`
- Step 1: Keys in BOTH maps
- Step 2: Check if values equal for shared keys
- Step 3: Keys only in A, only in B
→ Common: `[b,c]` | b: 2≠5, c: 3=3 | Only A: `[a]` | Only B: `[d]`

**Q78.** `"the quick brown fox jumps over the lazy dog the fox runs"`
- Step 1: Split, build frequency map
- Step 2: Find words appearing more than once
- Step 3: For each, find ALL positions (indices) where it appears
→ `{the:[0,6,9], fox:[3,10]}`

**Q79.** `[100,200,150,100,300,200,150,100,400]`
- Step 1: Frequency map
- Step 2: Sum of (value × frequency) for values appearing more than once
- Step 3: List values appearing exactly once
→ freq>1 sum=`1000` | appear once: `[300,400]`

**Q80.** `{"team1":{"wins":10,"losses":5},"team2":{"wins":8,"losses":7},"team3":{"wins":12,"losses":3}}`
- Step 1: Compute win% per team = wins/(wins+losses)
- Step 2: Find highest
- Step 3: Sort all teams by win% descending
→ team3=80%, team1=66.7%, team2=53.3% → Highest: `team3`

**Q81.** `[1,2,3,4,5,6,7,8,9,10,11,12]`
- Step 1: Group by `number % 3` into `Map<Integer, List<Integer>>`
- Step 2: Sum each group
- Step 3: Find which remainder-group has highest sum
→ Rem0=[3,6,9,12] sum=30 | Rem1=[1,4,7,10] sum=22 | Rem2=[2,5,8,11] sum=26 → Highest: `rem0`

**Q82.** `"abracadabra"`
- Step 1: `Map<Character, List<Integer>>` — store all indices for each character
- Step 2: Find most frequent character
- Step 3: Find average gap between consecutive occurrences of that char
→ 'a' at [0,3,5,7,10] → gaps: 3,2,2,3 → avg=`2.5`

**Q83.** Keys: `["id1","id2","id3","id4"]`, Values: `[50,30,70,30]`
- Step 1: Build key→value map
- Step 2: Find keys sharing the same value
- Step 3: Group by shared value
→ `{30:[id2,id4]}`

**Q84.** `[5,1,5,2,1,5,3,1,5,4]`
- Step 1: Frequency map → find MODE
- Step 2: Remove all mode occurrences → find NEW mode of remaining
→ Mode=`5`(4×) → remaining: `[1,2,1,3,1,4]` → new mode=`1`

**Q85.** `"to be or not to be that is the question"`
- Step 1: Frequency map of words
- Step 2: Find longest word(s) (list all if tie)
- Step 3: Find repeated words
- Step 4: For each repeated word: frequency × word length
- Step 5: Repeated word with highest product
→ Repeated: to(2×2=4), be(2×2=4) → tie → list both: `[to, be]`

---

## Level 4 — No Library Shortcuts

**Q86.** `[1,1,2,3,3,3,4]` → frequency count WITHOUT HashMap — sort first, then count consecutive runs

**Q87.** `["a","b","a","c"]` → duplicate check WITHOUT HashSet — nested loop O(n²)

**Q88.** `{"a":1,"b":2,"c":3}` → find max value WITHOUT `entrySet()` — iterate `keySet()` + call `get()` each time

**Q89.** `[1,2,3,4,5]` and `[5,4,3,2,1]` → same elements regardless of order, WITHOUT sorting — use two frequency maps and compare

**Q90.** `["x","y","x","z","y","x"]` → max frequency element WITHOUT `Map.Entry` or streams — track `maxKey` and `maxCount` while building the map in one single pass


# ═══════════════════════════════════════
# SECTION 4 — MULTI-DIMENSIONAL ARRAY & NESTED LIST (Q91–Q120)
# ═══════════════════════════════════════

**Key syntax reminders:**
- `int[][] grid = new int[3][4]` — 3 rows, 4 cols
- `int[][] grid = {{1,2},{3,4,5},{6}}` — jagged array
- `grid.length` — number of rows
- `grid[i].length` — number of cols in row i
- `List<List<Object>> list = new ArrayList<>()` — nested list
- Add a row: `list.add(new ArrayList<>(Arrays.asList(1,"hi")))`
- `list.add("boy",2,3)` ← WRONG — add() takes ONE element
- `instanceof` — check type: `if (item instanceof Integer)`
- Global counter pattern across nested loops:
  ```java
  int idx = 0;
  for (List<Object> row : list)
      for (Object item : row) { /* use idx */ idx++; }
  ```

---

## Level 1 — Single Operation

**Q91.** `[[1,2,3],[4,5,6],[7,8,9]]` → sum of all elements → `45`

**Q92.** `[[1,2,3],[4,5,6],[7,8,9]]` → print row-wise → `1,2,3,4,5,6,7,8,9`

**Q93.** `[[1,2,3],[4,5,6],[7,8,9]]` → print column-wise → `1,4,7,2,5,8,3,6,9`

**Q94.** `[[1,2,3],[4,5,6],[7,8,9]]` → main diagonal sum `grid[i][i]` → `1+5+9=15`

**Q95.** `[[1,2,3],[4,5,6],[7,8,9]]` → anti-diagonal sum `grid[i][n-1-i]` → `3+5+7=15`

**Q96.** `[[1,2],[3,4],[5,6]]` → count of even numbers in entire grid → `3`

**Q97.** `[[1,2,3],[4,5],[6,7,8,9]]` (jagged) → find largest element across all rows → `9`

**Q98.** `[[1,2],[3,4]]` → transpose → `[[1,3],[2,4]]`

---

## Level 2 — Two-Step Combinations

**Q99.** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Sum each row
- Step 2: Find row index with maximum sum
→ Sums: 6,15,24 → row index `2`

**Q100.** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Sum each column
- Step 2: Find column index with minimum sum
→ Sums: 12,15,18 → col index `0`

**Q101.** `[[5,2],[3,4],[5,6]]`
- Step 1: Traverse as flattened sequence WITHOUT creating a new list — use global counter only
- Step 2: Print every alternate element from global index 0
→ Flattened: 5,2,3,4,5,6 → indices 0,2,4 → `5,3,5`

**Q102.** `[[1,2],[3,4],[5,6]]`
- Step 1: Reverse each row individually in place
- Step 2: Reverse order of rows themselves
→ After step1: `[[2,1],[4,3],[6,5]]` → After step2: `[[6,5],[4,3],[2,1]]`

**Q103.** `[["John",25],["Amy",30],["Raj",22]]`
- Step 1: Extract all ages
- Step 2: Find name corresponding to minimum age
→ Min age=22 → `"Raj"`

**Q104.** `[[1,2,3],[4,5,6],[7,8,9]]`
- Step 1: Replace every border element with `0`
- Step 2: Sum remaining non-border elements
→ Only `5` is non-border → sum=`5`

---

## Level 3 — Heavy Multi-Step

**Q105. (Classic — must know)** `[[1,2,3],[4,5,6],[7,8,9]]` → spiral traversal
- Right along top, down right side, left along bottom, up left side, inward
→ `1,2,3,6,9,8,7,4,5`

**Q106.** `[[1,2,3,4],[5,6,7,8],[9,10,11,12]]`
- Step 1: Value at row=2, col=1 → `10`
- Step 2: Sum of that row + that column, minus double-counted shared cell
→ Row2 sum=42, Col1 sum=18, shared=10 → `42+18-10=50`

**Q107. (Your exact interview type)** `[[1,"hi",2],["boy",3,"cat",4],[5,"home"]]`
- Step 1: Flatten conceptually (global index across all rows)
- Step 2: Print elements at global indices 0, 3, 6 (every 3rd)
→ Flattened: 1,"hi",2,"boy",3,"cat",4,5,"home" → indices 0,3,6 → `1, "boy", 4`

**Q108.** `[[2,4,6],[1,3,5],[8,10,12]]`
- Step 1: Find row containing maximum element
- Step 2: Find index of max in that row
- Step 3: Replace max with sum of its row (compute sum BEFORE replacing)
→ Max=12 in row2 col2 → row sum=30 → row becomes `[8,10,30]`

**Q109.** `[[1,2,1],[3,1,4],[1,5,1]]`
- Step 1: Extract main diagonal
- Step 2: Frequency map of WHOLE grid
- Step 3: Check if most frequent element also appears on the diagonal
→ Diagonal: [1,1,1] | Most frequent=`1` (5 times) | On diagonal → `true`

**Q110.** `[[1,2,3],[4,5,6],[7,8,9],[10,11,12]]`
- Step 1: Sum each row → grand total
- Step 2: Sum each column → grand total
- Step 3: Verify both totals match (they always will — sanity check practice)
→ Row total = col total = `78` → `true`

**Q111. (No merge/copy)** `[[1,2,3],[4,5,6],[7,8,9]]`
- Without creating new lists, count elements GREATER than the element directly before them in flattened order
- Use a `previousValue` variable, NOT array lookup
→ Every element > previous → count=`8`

**Q112. (Mixed types)** `[[1,2,3],["a","b"],[4.5,5.5,6.5,7.5]]`
- Step 1: Use `instanceof` to classify each inner list type
- Step 2: Sum numeric lists only (skip String lists)
→ List0 (Integer)=6, List1 (String)=skip, List2 (Double)=24.0 → total=`30.0`

**Q113.** `[[5,1,4],[2,8,3],[9,6,7]]`
- Step 1: Find 2nd largest element in EACH row separately
- Step 2: Sum those 2nd-largest values
→ Row0=4, Row1=3, Row2=7 → sum=`14`

**Q114.** `[[1,2,3,4],[5,6,7,8],[9,10,11,12],[13,14,15,16]]`
- Step 1: Sum of all BORDER elements
- Step 2: Sum of all INTERIOR elements
- Step 3: Verify: border + interior = total
→ Interior=[6,7,10,11]=34 | Border=102 | Total=136 | 102+34=136 ✓

**Q115. (Very heavy — combines all patterns)** `[[3,"apple",1],["banana",2,4],[5,"cherry",6]]`
- Step 1: Single traversal — separate numerics and strings using `instanceof`
- Step 2: Sum of all numeric values
- Step 3: Find alphabetically first string
- Step 4: Find global flattened index of that string
→ Num sum=`21` | First alpha=`"apple"` | Flattened: 3,"apple",1,"banana",2,4,5,"cherry",6 → "apple" at index `1`

---

## Level 4 — No Shortcuts / In-Place Only

**Q116.** `[[1,2],[3,4],[5,6]]` → transpose — explain WHY this cannot be done truly in-place for non-square matrices (output shape differs from input), and what minimal extra space is justified

**Q117.** `[[1,2,3],[4,5,6],[7,8,9]]` → rotate 90° clockwise IN PLACE (square matrix only) → `[[7,4,1],[8,5,2],[9,6,3]]`

**Q118.** `[[1,2,3],[4,5,6],[7,8,9]]` → spiral order WITHOUT a result list — print each element as visited using four boundary pointers: top, bottom, left, right

**Q119. (Your original interview question)** `[[1,"hi"],["boy",2,3],[4,"home"]]`
- Print every alternate element (global index 0,2,4,6...)
- Use ONLY a counter variable — no flattening, no new list
→ `1, boy, 3, home`

**Q120.** `[[1,2,3],[4,5,6],[7,8,9]]` → check if matrix is symmetric (`grid[i][j] == grid[j][i]` for all i,j) WITHOUT computing the transpose — compare cells directly in nested loops

