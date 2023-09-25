package DSA.matrix;

public class subMatrixSumQueries {
    public int[] solve(int[][] A, int[] B, int[] C, int[] D, int[] E) {
        //No of Queries given all the arrays of same length to indicate the query indexes
        int k =  B.length;
        int mod = 1000000007;
        int[] res = new int[k];
        int rows=A.length;
        int columns = A[0].length;
        long[][] prefMatrix = new long[rows+1][columns+1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                prefMatrix[i][j]=(A[i - 1][j - 1] + prefMatrix[i - 1][j] + prefMatrix[i][j - 1] - prefMatrix[i - 1][j - 1] + mod) % mod;
            }
        }

//        for(int i = 0; i < B.length; i++){
//
//            int x1 = B[i], y1 = C[i], x2 = D[i], y2 = E[i];
//
//            long ans = preSum[x2][y2] - preSum[x2][y1 - 1] - preSum[x1 - 1][y2] + preSum[x1 - 1][y1 - 1];
//
//            while(ans < 0)
//
//                ans += mod;
//
//            ans = ans % mod;
//
//            res[i] = (int)ans;
//
//        }

        return res;


//        for (int i = 0; i < k; i++) {
//            int r1=B[i]-1, c1=C[i]-1, r2 =D[i]-1, c2=E[i]-1;
//            if(r1>0&&c1>0) {
//                long temp=A[r2][c2] - A[r2][c1 - 1] - A[r1 - 1][c2]+A[r1-1][c1-1];
//                res[i] = (int)(temp%1000000007);
//            }
//            else if(r1>0&&c1==0)
//            {
//                res[i]=A[r2][c2]-A[r1-1][c2];
//            }
//            else if(r1==0&&c1>0)
//            {
//                res[i]=A[r2][c2]-A[r2][c1-1];
//            } else {
//                res[i]=A[r2][c2];
//            }
//        }
//        return res;
    }
}
