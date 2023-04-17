package DSA;// Java program for the above approach

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

class Solution {

    // Function to find the maximum count of
    // unique substrings by splitting a string
    // into maximum number of unique substrings
    public int maxUniqueSplit(String S) {
        return maxUnique(S, new HashSet<String>());
    }

    // Utility function to find maximum count of
    // unique substrings by splitting the string
    public int maxUnique(String S, Set<String> set) {

        // Stores maximum count of unique substring
        // by splitting the string into substrings
        int max = 0;

        // Iterate over the characters of the string
        for (int i = 1; i <= S.length(); i++) {

            // Stores prefix substring
            String tmp = S.substring(0, i);

            // Check if the current substring
            // already exists
            if (!set.contains(tmp)) {

                // Insert tmp into set
                set.add(tmp);

                // Recursively call for remaining
                // characters of string
                max = Math.max(max, maxUnique(
                        S.substring(i), set)
                        + 1);

                // Remove from the set
                set.remove(tmp);
            }
        }

        // Return answer
        return max;
    }

    public int maxUniqueSplitNew(String s) {
        //return helper(s, new HashSet<>());
        return helperNew(s, new HashSet<>());

    }

    public int helper(String s, Set<String> seen) {
        int max = 0;
        for (int i = 1; i <= s.length(); i++) {
            String cadidate = s.substring(0, i);
            if (!seen.contains(cadidate)) {
                seen.add(cadidate);
                max = Math.max(max, 1 + helper(s.substring(i), seen));
                seen.remove(cadidate);
            }
        }
        return max;
    }

	public int helperNew(String s, Set<String> seen) {
    	Map<Character, Long> map = s.chars().mapToObj(c->(char)c)
				.collect(Collectors.groupingBy(c->c,Collectors.counting()));
		final String[] repeatedChar = {""};
    	int freq ;
		map.forEach((k, v) -> {
			if (v > 1) {
				repeatedChar[0] = k.toString();

				System.out.println(k + " : " + v);

			}
		});
		int max = 0;
		for (int i = 1; i <= s.length(); i++) {
			String candidate = s.substring(0, i);


		}
	return 1;
	}

	}


// Driver Code
class GFG {

    public static void main(String[] args) {
        Solution st = new Solution();
        String S = "cycle"; // cy, cle or c,ycle
        //int res = st.maxUniqueSplit(S);
        int res = st.maxUniqueSplitNew(S);

        System.out.println(res);
    }
}
