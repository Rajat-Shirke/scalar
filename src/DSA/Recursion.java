package DSA;

import java.util.Arrays;

public class Recursion {

    //--------merge sort--------------
    public int[] solve(int[] A) {

        int N= A.length;
        mergesort(A,0,N-1);
        return A;
    }
    void mergesort(int[] A,int s, int e)
    {
        if(s==e)
            return;
        int m=(s+e)/2;
        mergesort(A,s,m);
        mergesort(A,m+1,e);
        merge(A,s,m,e);
    }
    void merge(int[] A,int s,int m,int e)
    {
        int[] C=new int[e-s+1];
        int p1=s,p2=m+1,p3=0;
        while(p1 <= m && p2 <= e)
        {
            if(A[p1]<=A[p2])
            {
                C[p3]=A[p1];
                p3++;
                p1++;
            }
            else
            {
                C[p3]=A[p2];
                p3++;
                p2++;
            }
        }
        while(p1<=m)
        {
            C[p3]=A[p1];
            p3++;
            p1++;
        }
        while(p2<=e)
        {
            C[p3]=A[p2];
            p3++;
            p2++;
        }

        for (int i = s,j=0; i <= e; i++,j++) {
            A[i]=C[j];
        }

    }


//---------max mod----------
//    public int solve(int[] A) {
//        int n=A.length;
//        Arrays.sort(A);
//        int f_val=0,s_val=A[n-1];
//
//        for (int i = n-1; i > 0; i--) {
//            if(A[i]!=A[i-1])
//            {
//                f_val=A[i-1];
//                break;
//            }
//        }
//        return f_val%s_val;
//    }


//------------power function------------
//    public int pow(int A, int B, int C) {
//        if(A==0)
//            return 0;
//        if(B==0)
//            return 1;
//        long ans = pow(A,B/2,C)%C;
//        ans=(ans*ans)%C;
//        if(B%2==1)
//        {
//            ans = (ans*A)%C;
//        }
//        ans = (ans+C)%C;
//        return (int)ans;
//    }

    //-------Given a number A, check if it is a magic number or not.
//    public int solve(int A)
//    {
//        if(A%9==1)
//        {
//            return 1;
//        }
//        else
//        {
//            return 0;
//        }
//    }

}
