package DSA;

public class Adv_Array {

    //--------------Row with maximum number of ones
    public int solve(int[][] A) {

        int N = A.length;
        int M = A[0].length;
        int row=0,max_count = 0;;
        for (int i = 0; i < N; i++) {
           int count =0;
            for (int j = 0; j < M; j++) {
                if(A[i][j]==1)
                {
                    count++;
                }
            }
            if(count>max_count)
            {
                row=i;
                max_count=count;
            }
        }
        return row;
    }
}
