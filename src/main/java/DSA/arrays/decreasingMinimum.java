package DSA.arrays;

import java.util.Arrays;

public class decreasingMinimum {
    public int solve(int[] A, int B) {
        Arrays.sort(A);
        int len = A.length;
        int count=-1;
        if(A[len-1]<B)
        {
            return -1;
        }
        for (int i = A.length-1; i >=0 ; i--) {
            if(A[i]>=B)
            {
                continue;
            }
            else
            {
                count= i+1;
                break;
            }
        }
        return count;
    }
}
