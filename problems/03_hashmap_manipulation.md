# HashMap Manipulation — Practice Set

Concepts to know before starting: `HashMap<K,V>` declaration, `put`, `get`,
`getOrDefault`, `containsKey`, `remove`, iterating with `entrySet()`/`keySet()`/`values()`,
`merge()`, sorting a map's entries (convert `entrySet()` to a `List`, sort with
`Comparator`), `Map<K, List<V>>` for grouping, `LinkedHashMap` for insertion order,
`TreeMap` for sorted keys.

---

## Level 1 — Single Operation

**1.** `["a","b","a","c","b","a"]` → frequency map → `{a:3, b:2, c:1}`

**2.** `{"apple":50, "banana":20, "cherry":80}` → key with maximum value → `"cherry"`

**3.** `[1,2,3,1,2,1]` → does any element appear exactly 3 times? Which one? → `1`

**4.** `["apple","banana","apple","cherry","banana","apple"]` → distinct elements only → `[apple, banana, cherry]`

**5.** `{"math":80, "science":90, "english":70}` → average of all values → `80.0`

**6.** Two arrays `[1,2,3,4,5]` and `[3,4,5,6,7]` → common elements (intersection) using a HashSet → `[3,4,5]`

**7.** `[10,20,10,30,20,10]` → sum of UNIQUE elements only (each counted once) → `60`

**8.** `["apple","apt","bat","bad","ape"]` → group words by their first letter → `{a:[apple,apt,ape], b:[bat,bad]}`

---

## Level 2 — Two-Step Combinations

**9.** `["red","blue","red","green","blue","red","yellow"]`
- Step 1: Build frequency map
- Step 2: Find the element with the LOWEST frequency (that still appears)
→ Frequencies: red:3, blue:2, green:1, yellow:1 → lowest = `green` or `yellow` (tie — state your rule: first one encountered)

**10.** `[1,2,3,4,5,6,7,8,9,10]`
- Step 1: Build a map of `number -> isEven` (boolean)
- Step 2: Count how many entries have value `true`
→ `5` even numbers

**11.** `{"Alice":85, "Bob":92, "Charlie":78, "David":92}`
- Step 1: Find the maximum score
- Step 2: Find ALL names with that maximum score (handle ties properly — don't just return one)
→ Max = `92` → names: `[Bob, David]`

**12.** `[5,3,5,2,3,5,1,2,5]`
- Step 1: Build frequency map
- Step 2: Sort the map entries by frequency descending, print "value: frequency" for each
→ `5:4` highest — compute the rest of the counts and decide tie order yourself before sorting

**13.** `["cat","dog","cat","bird","dog","cat","fish"]`
- Step 1: Build frequency map
- Step 2: Build a REVERSE map: `frequency -> List of words with that frequency`
→ `{3:[cat], 2:[dog], 1:[bird,fish]}`

**14.** `{"a":1, "b":2, "c":3, "d":4, "e":5}`
- Step 1: Filter entries where value is even
- Step 2: Sum the values that passed the filter
→ Even values: b=2, d=4 → sum = `6`

---

## Level 3 — Heavy Multi-Step Manipulation

**15.** `["apple","banana","apple","orange","banana","apple","grape","orange"]`
- Step 1: Build frequency map
- Step 2: Sort words by frequency descending; if tie, sort alphabetically
- Step 3: Print top 2 most frequent words with their counts
→ apple:3, banana:2, orange:2, grape:1
→ Sorted: apple(3), banana(2), orange(2) [banana before orange alphabetically], grape(1)
→ Top 2: `apple:3, banana:2`

**16.** `[1,2,3,2,1,4,5,4,4,6]`
- Step 1: Build frequency map
- Step 2: Separate keys into two groups: "appears once" and "appears more than once"
- Step 3: Sum each group separately
→ Frequencies: 1:2, 2:2, 3:1, 4:3, 5:1, 6:1
→ Once: `[3,5,6]` sum = `14`; More than once: `[1,2,4]` sum = `7`

**17. (Two HashMaps)** Map A: `{"a":1,"b":2,"c":3}`, Map B: `{"b":5,"c":3,"d":4}`
- Step 1: Find keys present in BOTH maps
- Step 2: For keys in both, check if their values are EQUAL
- Step 3: Find keys present in A but not B, and vice versa
→ Common keys: `[b,c]` → equal values? b: 2 vs 5 (no), c: 3 vs 3 (yes)
→ Only in A: `[a]`, Only in B: `[d]`

**18. (Heavy)** `"the quick brown fox jumps over the lazy dog the fox runs"`
- Step 1: Split into words, build frequency map
- Step 2: Find words that appear MORE THAN ONCE
- Step 3: For each such word, find ALL the positions (indices in the word array) where it occurs
→ "the" appears at indices 0, 6, 9 → "fox" appears at indices 3, 10
→ Result: `{the:[0,6,9], fox:[3,10]}`

**19.** `[100,200,150,100,300,200,150,100,400]`
- Step 1: Build frequency map
- Step 2: Find the SUM of (value × frequency) only for values that appear more than once
- Step 3: Find all values that appear exactly once
→ 100:3, 200:2, 150:2, 300:1, 400:1
→ Sum for freq>1: (100×3)+(200×2)+(150×2) = 300+400+300 = `1000`
→ Appear once: `[300,400]`

**20. (Nested map)** `{"team1": {"wins":10,"losses":5}, "team2": {"wins":8,"losses":7}, "team3": {"wins":12,"losses":3}}`
- Step 1: For each team, compute win percentage = wins/(wins+losses)
- Step 2: Find the team with the highest win percentage
- Step 3: Sort all teams by win percentage descending
→ team1: 66.7%, team2: 53.3%, team3: 80%
→ Highest: `team3` → Order: `team3, team1, team2`

**21.** `[1,2,3,4,5,6,7,8,9,10,11,12]`
- Step 1: Group numbers by `number % 3` into `Map<Integer, List<Integer>>`
- Step 2: For each group, compute the sum
- Step 3: Find which remainder group has the highest sum
→ Remainder 0: [3,6,9,12] sum=30; Remainder 1: [1,4,7,10] sum=22; Remainder 2: [2,5,8,11] sum=26
→ Highest: remainder `0` with sum `30`

**22. (Heavy — character positions)** `"abracadabra"`
- Step 1: For each character, store a list of ALL indices where it appears: `Map<Character, List<Integer>>`
- Step 2: Find the character with the most occurrences
- Step 3: Find the average gap between consecutive occurrences of that character
→ 'a' appears at indices 0,3,5,7,10 (5 times — most frequent)
→ Gaps: 3,2,2,3 → average gap = `2.5`

**23. (Two-list zip into map)** Keys: `["id1","id2","id3","id4"]`, Values: `[50,30,70,30]`
- Step 1: Build a map pairing each key with its value
- Step 2: Find all keys that share the SAME value as another key (duplicate values)
- Step 3: Group these keys by their shared value
→ Map: `{id1:50,id2:30,id3:70,id4:30}`
→ Value 30 shared by id2 and id4 → Result: `{30:[id2,id4]}`

**24.** `[5,1,5,2,1,5,3,1,5,4]`
- Step 1: Build frequency map
- Step 2: Find the MODE (most frequent element)
- Step 3: Remove the mode from the original list entirely, then find the NEW mode of the remaining elements
→ Original mode: `5` (4 times) → remove all 5s → remaining: `[1,2,1,3,1,4]` → new mode: `1` (3 times)

**25. (Very heavy — combines everything)** `"to be or not to be that is the question"`
- Step 1: Split into words, build frequency map
- Step 2: Find the longest word(s) — if tie, list all
- Step 3: Find words that appear more than once
- Step 4: For each repeated word, compute: (frequency × word length)
- Step 5: Find the repeated word(s) with the highest such product
→ Work through the frequency map first, then check word lengths for the longest, then identify repeats (to, be), then compute their products and compare

---

## Level 4 — "No Library Shortcuts" Variants

**26.** `[1,1,2,3,3,3,4]` → frequency count WITHOUT HashMap — sort the array first, then count consecutive runs manually

**27.** `["a","b","a","c"]` → check if any duplicates exist WITHOUT HashSet — nested loop comparison (O(n²))

**28.** `{"a":1,"b":2,"c":3}` → find max value WITHOUT iterating `entrySet()` — iterate `keySet()` and call `get()` for each key

**29.** `[1,2,3,4,5]`, `[5,4,3,2,1]` → check if both arrays contain the same elements (regardless of order) WITHOUT sorting — use frequency maps and compare them

**30.** `["x","y","x","z","y","x"]` → find the element with max frequency WITHOUT `Map.Entry` or streams — track `maxKey` and `maxCount` variables while building the map in a single pass
