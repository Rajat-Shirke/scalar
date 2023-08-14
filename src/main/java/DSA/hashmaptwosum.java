package main.java.DSA;

import java.util.HashMap;

public class hashmaptwosum {
    public int[] twoSum(final int[] A, int B) {
        int N = A.length;
        HashMap<Integer, Integer> hm = new HashMap<>();
        if (N < 2) {
            return new int[]{};
        }
        for (int i = 0; i < N; i++)
        {
            int reqval = B - A[i];


            if (hm.containsKey(A[i])) {

                int val = hm.get(A[i]) + 1;
                return new int[]{val, i + 1};
            }
            if (hm.containsKey(reqval)) continue;
            hm.put(reqval, i);
        }
        return new int[]{};
    }
}
