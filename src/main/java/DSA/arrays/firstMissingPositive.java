package DSA.arrays;

import java.util.Arrays;
import java.util.HashSet;

public class firstMissingPositive {
    public int firstMissingPositive(int[] A) {
        int N =A.length;
        int res=0;
        HashSet<Integer> hashSet = new HashSet<>();

        for (int i = 0; i < N; i++)
        {
            hashSet.add(A[i]);
        }
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            if(!hashSet.contains(i)) {
                res=i;
                break;
            }
        }
        return res;
    }
}
