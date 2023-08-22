package DSA.hashMapProblems;

import java.util.HashMap;

public class pairsWithGivenDifference {
    //All possible pairs where i != j
    public int solve(int[] A, int B) {
        int arrayLength = A.length;
        int pairCount=0;
        HashMap<Integer,Integer> hashmap = new HashMap<>();
        for (int i = 0; i < arrayLength; i++) {
            if(!hashmap.containsKey(A[i])){
                hashmap.put(A[i],i);
            }
        }
        for (int i = 0; i < arrayLength; i++) {
            if(hashmap.containsKey(A[i]+B) && hashmap.get(A[i]+B)!=i) {
                pairCount++;
                hashmap.put(A[i]+B,1);
            }
        }
        return pairCount;
    }
}
