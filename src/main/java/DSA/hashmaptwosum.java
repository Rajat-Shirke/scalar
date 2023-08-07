package main.java;

import java.util.HashMap;

public class hashmaptwosum {
    public int[] twoSum(final int[] A, int B) {
        int N=A.length;
        HashMap<Integer,Integer> hm= new HashMap<>();

        for (int i = 0; i < N; i++) {
            int reqval=B-A[i];
            if(hm.containsKey(A[i]))
            {
                return
            }
            hm.put(A[i],reqval);



        }

        for (int i = 0; i < N; i++) {
            if(hm.containsKey(A[i]))

        }
    }
}
