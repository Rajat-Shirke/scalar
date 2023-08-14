package main.java.DSA;

import java.util.Arrays;
import java.util.HashMap;

public class contest4 {
//    public int paint(int A, int B, int[] C) {
//        int ans = 0;
//
//
//        return ans;
//    }


    public int solve(int[] A, int[] B) {
        int N=A.length;
        int M=B.length;
        int sum =0;
        Arrays.sort(A);
        Arrays.sort(B);
        //Not optimal O(N^2)
//        for (int i = 0; i < N; i++) {
//
//            for (int j = 0; j < M; j++) {
//                sum=sum+Math.min(A[i],B[j]);
//            }
//
//        }
        int i=0,j=0;
        while(i<N && j<M)
        {
            if(B[j]<A[i]) {
              sum+=(B[j]%1000000007 * (N - i)%1000000007);
                j++;
            }
            else if(B[j]>A[i]) {
                sum+=A[i]*(M-j);
                i++;
            }
            else if(B[j]==A[i]) {
                sum+=A[i] * (M - j);
                i++;
            }

        }

        return sum;
    }

    public String convertToTitle(int A) {

        StringBuilder res= new StringBuilder();
        int dev =A, mod=0;

        int n = 0;
        char DeciChar[]={'A','B','C','D','E','F','G','H','I','J','K','L','M','N','0','P','Q','R','S','T','U','V','W','X','Y','Z'};

        while(dev>0) {
            mod = (dev-1) % 26;
            res.append(DeciChar[mod]);
            dev = (dev-1) / 26;


        }
            int dummy=-1;
        return res.reverse().toString();
    }
}
