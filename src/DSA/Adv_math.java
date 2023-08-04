package DSA;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Adv_math {

//-----------Elements Removal--------------
//    public int solve(int[] A) {
//        Arrays.sort(A);
//        reverse(A);
//        int N = A.length;
//        int totalCost=0;
//        for (int i = 0; i < N; i++) {
//            totalCost +=(A[i]*(i+1));
//        }
//        return totalCost;
//
//
//    }
//    public static void reverse(int[] input)
//    {
//        int middle = input.length / 2;
//        int last = input.length - 1;
//        for (int i = 0; i < middle; i++)
//        {
//            int temp = input[i];
//            input[i] = input[last - i];
//            input[last - i] = temp;
//        }
//    }

    //-------------Largest Number from Array elements--------------
//    public String largestNumber(final int[] A) {
//        int N= A.length;
//        int[] ar = Arrays.copyOf(A,N);
//
//        for (int i = 0; i < N; i++) {
//            for (int j = 1; j < N ; j++) {
//                int cmp_val=conc_comp(ar[j-1],ar[j]);
//                if(cmp_val==1)
//                {
//                    int temp = ar[j];
//                    ar[j]=ar[j-1];
//                    ar[j-1]=temp;
//                }
//            }
//        }
//        System.out.println(ar);
//        StringBuilder sb = new StringBuilder();
//        for (int j : ar) {
//            sb.append(j);
//        }
//        return sb.toString();
//
//    }
//    public int conc_comp(int a,int b)
//    {
//        long fa = Long.parseLong(a +""+ b);
//        long fb = Long.parseLong(b +""+ a);
//        if(fa>fb || fa==fb)
//        {
//            return -1;
//        }
//
//        else
//        {
//            return 1;
//        }
//    }


    //--------Factors Sort-------------
//    public int[] solve(int[] A) {
//        int N= A.length;
//        int[] fAr = new int[N];
//        for (int i = 0; i < N; i++) {
//            fAr[i]=nooffactors(A[i]);
//        }
//        for (int i = 0; i < N; i++) {
//            for (int j = 1; j < N ; j++) {
//                int cmp_val=comp(A[j-1],A[j],fAr[j-1],fAr[j]);
//                if(cmp_val==1)
//                {
//                    int temp = A[j];
//                    A[j]=A[j-1];
//                    A[j-1]=temp;
//
//                    temp = fAr[j];
//                    fAr[j]=fAr[j-1];
//                    fAr[j-1]=temp;
//                }
//            }
//        }
//        System.out.println(A);
//        return A;
//    }
//    public int comp(int a,int b,int fa,int fb)
//    {
//        if(fa<fb)
//        {
//            return -1;
//        }
//        else if(fa==fb && a<b)
//        {
//            return -1;
//        }
//        else
//        {
//            return 1;
//        }
//    }
//
//
//    public int nooffactors(int n) {
//        int cnt=0;
//        for (int i = 1; i*i <=n ; i++) {
//            if(n%i==0)
//            {
//                if(i==n/i)
//                {
//                    cnt+=1;
//                }
//                else {
//                    cnt += 2;
//                }
//            }
//        }
//        return cnt;
//    }
    //-------------Given an array of integers A, find and return the count of divisors of each element of the array.
    public int[] solve(int[] A) {
        int N = A.length;

        int[] spf = new int[100005];
        for (int i = 1; i < 100005; i++) {
            spf[i] = i;
        }
        for (int i = 2; i * i < 100005; i++) {
            for (int j = i * i; j < 100005; j += i) {
                if (spf[j] == j) {
                    spf[j] = i;
                }

            }
        }
        int[] soln = new int[N];

        for (int i = 0; i < N; i++) {
            int temp = A[i];
            int ans = 1;

            while (temp != 1) {
                int cnt = 1;
                int d = spf[temp];
                while (temp != 1 && temp % d == 0) {
                    cnt++;
                    temp = temp / d;
                }
                ans = ans * cnt;
            }
            soln[i] = ans;
        }

        return soln;
    }
//    public int[] solve(int[] A) {
//        int N=A.length;
//        int[] spf= new int[N];
//        for (int i = 0; i < N; i++) {
//            spf[i]=smallestDivisor(A[i]);
//        }
//        for (int i = 0; i < N; i++) {
//            if(A[i]==spf[i])
//            {
//                spf[i]=2;
//            }
//            else {
//                int temp = A[i];
//                int ans = 1;
//
//                while (temp != 1) {
//                    int cnt = 1;
//                    int d = spf[i];
//                    while (temp != 1 && temp % d == 0) {
//                        cnt++;
//                        temp = temp / d;
//                    }
//                    ans = ans * cnt;
//                }
//                spf[i] = ans;
//            }
//        }
//        return spf;
//    }
//    static int smallestDivisor(int n)
//    {
//        // if divisible by 2
//        if (n % 2 == 0)
//            return 2;
//
//        // iterate from 3 to sqrt(n)
//        for (int i = 3;
//             i * i <= n; i += 2)
//        {
//            if (n % i == 0)
//                return i;
//        }
//
//        return n;
//    }

    //----------A lucky number is a number that has exactly 2 distinct prime divisors.
    //You are given a number A, and you need to determine the count of lucky numbers between the range 1 to A (both inclusive).

//    public int solve(int A) {
//
//        int[] ar = new int[A+1];
//        Arrays.fill(ar,0);
//
//        for (int i = 2; i <= A; i++) {
//            if(ar[i]==0)
//            {
//                for (int j = 2 * i; j <= A; j=j+i) {
//                    ar[j]=ar[j]+1;
//
//                }
//            }
//        }
//        int count=0;
//        for (int i = 2; i <=A ; i++) {
//            if(ar[i]==2)
//            {
//                count++;
//            }
//        }
//        return count;
//    }


    //--------------Prime Subsequences-------------------
//    public int solve(int[] A) {
//        int N=A.length,M=0;
//        for (int i = 0; i < N; i++) {
//            if(isPrime(A[i]))
//            {
//                M++;
//            }
//        }
//        int res=  pow(2,M,1000000007);
//        return (res-(1%1000000007))%1000000007;
//
//    }
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
//    static boolean isPrime(int n)
//    {
//
//        if (n <= 1)
//            return false;
//
//        // Check from 2 to sqrt(n)
//        for (int i = 2; i <= Math.sqrt(n); i++)
//            if (n % i == 0)
//                return false;
//
//        return true;
//    }
}
