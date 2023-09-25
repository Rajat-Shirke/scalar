package DSA.matrix;
import java.util.List;

import java.util.ArrayList;

public class maxSubMatrixSum {
    public long solve(int[][] A) {
        long ans=Integer.MIN_VALUE;
        int rows=A.length;
        int columns = A[0].length;
        long[][] prefMatrix = new long[rows+1][columns+1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                prefMatrix[i][j]=A[i - 1][j - 1] + prefMatrix[i - 1][j] + prefMatrix[i][j - 1] - prefMatrix[i - 1][j - 1];
            }
        }
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                long tempans = prefMatrix[rows][columns] - prefMatrix[rows][j - 1] - prefMatrix[i - 1][columns] + prefMatrix[i - 1][j - 1];
                ans=Math.max(ans,tempans);
            }
        }
        return ans;
    }

    static List<List<Integer>> doit(List<List<Integer>> matrix) {
        int[][] A = matrix.stream()
                .map(l -> l.stream().mapToInt(Integer::intValue).toArray())
                .toArray(int[][]::new);

        int ans=Integer.MIN_VALUE;
        int rows=A.length;
        int columns = A[0].length;
        int[][] prefMatrix = new int[rows+1][columns+1];
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                prefMatrix[i][j]=A[i - 1][j - 1] + prefMatrix[i - 1][j] + prefMatrix[i][j - 1] - prefMatrix[i - 1][j - 1];
            }
        }
        int temp_max = Integer.MIN_VALUE;
        int max_row=0, max_col=0;
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= columns; j++) {
                if(prefMatrix[i][j]>temp_max)
                {
                    max_row=i;
                    max_col=j;
                    temp_max=prefMatrix[i][j];
                }
            }
        }
        int start_row=0,start_col=0;
        for (int i = 1; i <= max_row; i++) {
            for (int j = 1; j <= max_col; j++) {
                int tempans = prefMatrix[rows][columns] - prefMatrix[rows][j - 1] - prefMatrix[i - 1][columns] + prefMatrix[i - 1][j - 1];
                if(tempans>temp_max)
                {
                    start_row=i-1;
                    start_col=j-1;
                    temp_max=tempans;
                }
            }
        }
        List<List<Integer>> res = new ArrayList<>();

        for (int i = start_row; i <=max_row ; i++) {
            List<Integer> row_vals = new ArrayList<>();
            for (int j = start_col; j <= max_col; j++) {
                row_vals.add(A[i][j]);
            }
            res.add(row_vals);
        }
        return res;
    }
}
