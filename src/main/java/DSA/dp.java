package DSA;

import java.util.Arrays;

public class dp {

    public int solve(int[] A) {
        int N = A.length;
        int[][] ar = new int[N+1][N+1];

        for (int i = 0; i < N+1; i++)
        {
            Arrays.fill(ar[i],-1);
            ar[i][i]=0;
        }
        mcm(A, ar,0, 0);
        return ar[0][N];
    }
    public int mcm(int[] d,int[][] ar, int i, int j)
    {
        if(ar[i][j]==-1)
        {
            int c= Integer.MAX_VALUE;
            for (int k = i; k < j-1; k++)
            {
                c = Math.min(c, (mcm(d,ar, i, k) + mcm(d,ar, k + 1, j) + (d[i - 1] * d[k] * d[j])));
            }
            ar[i][j]=c;
        }
        return ar[i][j];
    }
}
