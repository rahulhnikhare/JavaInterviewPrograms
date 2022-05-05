package hackerank;

import java.util.HashMap;
import java.util.Map;

public class BestAverageCalculator {
    public static void main(String[] args) {
        String[][] tc1 = { { "Bobby", "87" },
                { "Charles", "100" },
                { "Eric", "64" },
                { "Charles", "22" } };
        System.out.println(bestAverageCalculator(tc1));
    }

    public static int  bestAverageCalculator(String[][] scores) {

        // This HashMap maps student name to their total scores and count in an int array format of [totalScores, count]
        Map<String,int[]> scoreMap = new HashMap<String,int[]>();
        for(String[] score:scores) {
            String name = score[0];
            int currentScore =Integer.parseInt(score[1]);

            if(scoreMap.containsKey(name)) {
                int[] scoreCount = scoreMap.get(name);
                scoreCount[0] += currentScore;
                scoreCount[1] ++;
                scoreMap.put(name, scoreCount);
            }
            else {
                int[] scoreCount = new int[]{currentScore, 1};
                scoreMap.put(name, scoreCount);
            }
        }

        int bestAverage = 0;
        for(int[] value:scoreMap.values()) {
            int average = (int)Math.floor(value[0]/value[1]);
            if(average>bestAverage)
                bestAverage = average;
        }

        return bestAverage;// returns 85

    }
}
