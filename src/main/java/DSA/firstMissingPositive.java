package main.java.DSA;

import java.util.Arrays;

public class firstMissingPositive {
    public int firstMissingPositive(int[] A) {
        int N =A.length;
        //Arrays.sort(A);
        for (int i = 0; i < N; i++)
        {
            if(A[i]>0)
                break;
            return 1;
        }
        int min_val=0,max_val=0;
        for (int i = 0; i < N; i++) {
            if(A[i]>0 && min_val<A[i])
            {
                //min_val=Math.min(A[i]-1,min_val);
                min_val=A[i]-1;
                max_val=A[i]+1;
            }
        }
        if(min_val==0)
            return max_val;
        else
            return min_val;
    }
}
