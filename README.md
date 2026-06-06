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

