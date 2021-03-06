package hackerank;// Java program to count frequencies of array items

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

class CountFrequencyOfArrayItem {
    public static HashMap<Integer, Integer> countFreq(int arr[], int n) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        boolean visited[] = new boolean[n];

        Arrays.fill(visited, false);

        // Traverse through array elements and
        // count frequencies
        for (int i = 0; i < n; i++) {

            // Skip this element if already processed
            if (visited[i] == true)
                continue;

            // Count frequency
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
            hm.put(arr[i], count);
        }
        return hm;
    }

    public static HashMap<Integer, Integer> countFrequency(int arr[]) {
        HashMap<Integer, Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int arrVal = arr[i];
			Integer val = hashmap.get(arrVal);
			if (val != null) {
				hashmap.put(arrVal, new Integer(val + 1));
			}
			else {
				hashmap.put(arrVal, 1);
			}
        }

		System.out.println("Hm->>" +hashmap);

        return hashmap;
    }

    // Driver code
    public static void main(String[] args) {
        int arr[] = new int[]{10, 20, 20, 10, 10, 20, 5, 20};
        int n = arr.length;
        HashMap<Integer, Integer> hm = countFreq(arr, n);
		HashMap<Integer, Integer> hm1 =countFrequency(arr);
        int maxValueInMap = (Collections.max(hm.values()));  // This will return max value in the Hashmap

        System.out.println("&&0->" + maxValueInMap);

        for (Map.Entry<Integer, Integer> entry : hm.entrySet()) {  // Itrate through hashmap
            if (entry.getValue() == maxValueInMap) {
                System.out.println(entry.getKey());     // Print the key with max value
            }
        }

    }
}

// This code contributed by Adarsh_Verma.
