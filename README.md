# product-based-interview-prep-sirisha
My journey to crack product-based companies with DSA, System Design, Java,Angular, AI, and AWS


--------------------------------------------------------------------------------------------------------
When you see this in a problem → think HashMap

1.Problem says "find if X exists" or "find duplicate" — instant HashSet/HashMap

2.Words like "frequency", "count", "how many times"— store counts in a map

3.Problem asks for a pair or group — e.g. "two numbers that sum to K"

4.Input is unsorted & you need O(1) lookup — HashMap beats sorting

5.Words like "anagram", "permutation" — frequency map of characters


Hashmap template ----->

Map<Integer, Integer> map = new HashMap<>();

for (int x : nums) {

    // Option A: check if complement exists first
   
 if (map.containsKey(target - x)) {
        // found the pair
    }
    map.put(x, map.getOrDefault(x, 0) + 1);
    
    // Option B: frequency counting
    // map.put(x, map.getOrDefault(x, 0) + 1);
}

Algo :Space& Time 

Arrays.sort(n) --->Always take klog k cost
Yes — sorting always costs O(k log k) where k = number of elements being sorted. This is a fact about how sorting works.
You don't derive it every time — you just memorise it like a formula and move on.

complexity cheatsheet
The only complexity cheat sheet you need for interviews

Arrays.sort(arr)  -----   Always O(k log k)-->k = array length

map.get() / map.put()----- Always O(1)---->HashMap lookup is instant

Simple for loop ----O(n) ----->visits each element once

Loop inside loop ---> O(n²) -----n × n comparisons

Halving repeatedly(binary search)  ---- O(log n)-->halve → halve → halve

Single statement
(int x = 5)    -----O(1)----> same cost always
  ~~Space complexity:~~
What you createSpace costnew HashMap<>() storing n items -->O(n) 
new int[n] / new char[n]  ----> O(n)
A few plain variables int i, j -----> O(1) — doesn't grow 
Recursion calling itself n times   ---> O(n) — the call stack
Nothing new created ---->O(1)
-------------------------------------------------------------

priority Queue -> data structure that automatically keeps elements in sorted order
 and you can just pick the top k from it, its not threadsafe , so to leverage threadsafe use Priority Blocking Queue

treeMap also keeps the elements in sorted order , but it does this sort order only with keys -> treemap use sortbykey to keep in sorted order
