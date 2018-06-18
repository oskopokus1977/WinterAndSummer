package com;

public class Solution {

    public static int solution(int[] yearDays) {
        int countWinterDays = yearDays.length;
        int maxSumTemp = yearDays[0];
        int maxWinTemp = yearDays[0];

        boolean isWinter = true;

        for (int i = 0; i < yearDays.length; i++) {
            if (!isWinter) {
                if (yearDays[i] <= maxWinTemp) {
                    maxWinTemp = maxSumTemp;
                    isWinter = true;
                }
            } else {
                if (yearDays[i] > maxWinTemp) {
                    countWinterDays = i;
                    maxSumTemp = maxWinTemp;
                    isWinter = false;
                }
            }
        }
        return countWinterDays;
    }
}


