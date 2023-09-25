package DSA.slidingWindow;

import DSA.bitManipulation.Main;

public class minimumSwaps {
    public int solve(int[] A, int B) {
        int swapCount = 0;
        int arrayLen = A.length;

        int minNumbersThanB = 0;
        for(int i = 0; i < arrayLen; i++) {
            if(A[i]<=B)
            {
                minNumbersThanB++;
            }
        }
        for (int i = 0; i < minNumbersThanB; i++) {
            if(A[i]>B)
                swapCount++;
        }
        int maxNumbers = swapCount;

        for (int i = 1; i <(arrayLen-minNumbersThanB+1) ; i++) {
            if((A[i-1]<=B&&A[minNumbersThanB+i-1]<=B)||(A[i-1]>B&&A[minNumbersThanB+i-1]>B))
            {
                continue;
            }
            else if(A[i-1]<=B&&A[minNumbersThanB+i-1]>B)
            {
                maxNumbers++;
            }
            else if(A[i-1]>B&&A[minNumbersThanB+i-1]<=B)
            {
                maxNumbers--;
            }
            swapCount= Math.min(maxNumbers,swapCount);
        }

        return swapCount;

    }
}
