package DSA.matrix;


public class Main {
    public static void main(String[] args)
    {
//       subMatrixSumQueries s =new subMatrixSumQueries();
//       int[][] A= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
//       int[] B = new int[]{1,2};
//        int[] C = new int[]{1,2};
//        int[] D = new int[]{2,3};
//        int[] E = new int[]{2,3};
//        int[] ans = s.solve(A,B,C,D,E);

        maxSubMatrixSum s =new maxSubMatrixSum();
//        int[][] A= new int[][]{{1,2,3},{4,5,6},{7,8,9}};
        int[][] A= new int[][]{{-5,-4,-3},{-1,2,3},{2,2,4}};
        long ans = s.solve(A);
        int dummy = -1;
    }
}
