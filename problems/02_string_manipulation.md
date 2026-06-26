# String Manipulation — Practice Set

Concepts to know before starting: Strings are immutable (every modification creates a new
String — use `StringBuilder` for heavy edits), `charAt()`, `substring(start,end)`,
`toCharArray()`, `String.valueOf()`, `Character.isDigit()/isLetter()/isUpperCase()`,
ASCII arithmetic with `char` (`(int)c`, `(char)(c+1)`), `split()`, `trim()`.

---

## Level 1 — Single Operation

**1.** `"hello"` → reversed → `"olleh"` (3 ways: StringBuilder, char array swap, recursion — practice all 3)

**2.** `"racecar"` → is it a palindrome? → `true`

**3.** `"Hello World"` → count of vowels → `3` (e, o, o)

**4.** `"programming"` → character frequency map → `{p:1,r:2,o:1,g:2,a:1,m:2,i:1,n:1}`

**5.** `"Hello"` → swap case of every character → `"hELLO"`

**6.** `"  hello world  "` → trimmed, internal multiple spaces collapsed to single → `"hello world"`

**7.** `"abcabcbb"` → length of longest substring without repeating characters → `3`

**8.** `"aabbccdde"` → first non-repeating character → `'e'`

**9.** `"listen"`, `"silent"` → are they anagrams? → `true`

**10.** `"Hello123World456"` → separate into letters-only and digits-only strings → `"HelloWorld"`, `"123456"`

---

## Level 2 — Two-Step Combinations

**11.** `"the quick brown fox jumps"`
- Step 1: Split into words
- Step 2: Reverse the order of words
→ `"jumps fox brown quick the"`

**12.** `"the quick brown fox"`
- Step 1: Reverse each word individually
- Step 2: Keep word order the same
→ `"eht kciuq nworb xof"`

**13.** `"aaabbbcc"`
- Step 1: Run-length encode (count consecutive repeats)
- Step 2: Return as string
→ `"a3b3c2"`

**14.** `"a3b3c2"` (decode — reverse of above)
- Step 1: Parse character+count pairs
- Step 2: Expand back to original string
→ `"aaabbbcc"`

**15.** `"Programming in Java"`
- Step 1: Count total characters (excluding spaces)
- Step 2: Count total words
- Step 3: Find the longest word
→ chars (no space) = `17`, words = `3`, longest = `"Programming"`

**16.** `"interviewpreparation"`
- Step 1: Build frequency map
- Step 2: Find all characters with frequency > 1
- Step 3: Sort those characters alphabetically and join into a string
→ Build the map carefully and verify counts before sorting — don't assume the answer, compute it

---

## Level 3 — Heavy Multi-Step Manipulation

**17.** `"Hello World 123 Foo Bar 456"`
- Step 1: Extract all numbers from the string as a list of integers
- Step 2: Sum those numbers
- Step 3: Replace all numbers in the original string with `"#"`
→ Numbers: `[123, 456]`, sum = `579`
→ Result string: `"Hello World # Foo Bar #"`

**18.** `"madam arora teaches malayalam"`
- Step 1: Remove all spaces
- Step 2: Check if the resulting string is a palindrome
→ `"madamaroratreachesmalayalam"` → verify by computing, don't assume

**19.** `"aabbbccccd"`
- Step 1: Find the character with maximum frequency
- Step 2: Find the character(s) with minimum frequency that still appear
- Step 3: Remove all occurrences of the max-frequency character from the string
→ Max freq: `'c'` (4 times) → result with 'c' removed: `"aabbbd"`

**20.** `"This is a Test String for Practice"`
- Step 1: Convert to lowercase
- Step 2: Count frequency of each word
- Step 3: Check if any word appears more than once
→ Words: this, is, a, test, string, for, practice → no repeats → `false`

**21. (Heavy)** `"abcdefcba"`
- Step 1: For each character, compare it with its mirror position (`s.charAt(i)` vs `s.charAt(length-1-i)`)
- Step 2: Count how many mirror pairs match
- Step 3: Determine "almost palindrome" — true if mismatches <= 1
→ Length 9, compare i with 8-i for i=0..3 (middle index 4 ignored)
→ a-a(match), b-b(match), c-c(match), d-f(mismatch) → 1 mismatch → almost palindrome = `true`

**22.** `"aaaabbbcc dd eeeee"`
- Step 1: Split by spaces into words
- Step 2: Run-length encode each word
- Step 3: Join encoded words back with spaces
→ Words: `"aaaabbbcc"`, `"dd"`, `"eeeee"`
→ Encoded: `"a4b3c2"`, `"d2"`, `"e5"`
→ Result: `"a4b3c2 d2 e5"`

**23. (Common in product companies)** `"abcabcbb"`
- Step 1: Find the longest substring without repeating characters (the substring itself, not just length)
- Step 2: Find the starting index of that substring
→ Longest substring = `"abc"`, length 3, starting index `0`

**24.** `"Mississippi"`
- Step 1: Build frequency map (case-sensitive)
- Step 2: Find all characters that appear an EVEN number of times
- Step 3: Concatenate those characters (in order of first appearance) into a result string
→ Compute counts carefully (M, i, s, s, i, s, s, i, p, p, i) before deciding which are even

**25. (Two strings, heavy)** `"abcdef"`, `"defabc"`
- Step 1: Check if string2 is a rotation of string1 — implement manually by checking character alignment (don't use the `(s1+s1).contains(s2)` shortcut, build the logic yourself)
- Step 2: If yes, find the rotation offset (how many positions it's rotated)
→ string2 is string1 rotated left by 3 → rotation = `true`, offset = `3`

---

## Level 4 — "No Library Shortcuts Allowed" Variants

**26.** `"Hello"` → reverse WITHOUT `StringBuilder.reverse()`, WITHOUT recursion — only char array + manual swap loop

**27.** `"racecar"` → palindrome check WITHOUT `StringBuilder` — pure two-pointer on `charAt()`

**28.** `"aabbccddeeff"` → frequency count WITHOUT HashMap — use an `int[26]` array indexed by `(char - 'a')`

**29.** `"hello world"` → capitalize first letter of each word WITHOUT `split()` — manual character-by-character scan tracking "start of word" state

**30.** `"abcabcbb"` → longest substring without repeating chars WITHOUT HashSet/HashMap — use a `boolean[256]` array to track "seen" characters
