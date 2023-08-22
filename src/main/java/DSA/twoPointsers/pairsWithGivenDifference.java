package DSA.twoPointsers;

import java.util.Arrays;
import java.util.HashMap;

public class pairsWithGivenDifference {
    public int solve(int[] A, int B) {
        int arrayLength = A.length;
        int pairCount=0,i=0,j=1;
        Arrays.sort(A);
        while(i<arrayLength&&j<arrayLength){
            if(A[j]-A[i]==B && i!=j){
                pairCount++;
                int k = i+1,l=j+1;
                while(k<arrayLength&&A[k]==A[i]){
                    k++;
                }
                while(l<arrayLength&&A[l]==A[j]){
                    l++;
                }
                i=k;j=l;
            }
            else if(A[j]-A[i]<B){
                j++;
            }
            else {
                i++;
            }
        }
        return pairCount;
    }
}
