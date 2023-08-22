package DSA.hashMapProblems;

public class Main {
    public static void main(String[] args)
    {
        pairsWithGivenDifference ob = new pairsWithGivenDifference();
//        int[] inputArr=new int[]{8, 12, 16, 4, 0, 20};
//        int valToCheck = 4;
        int[] inputArr=new int[]{1,2};
        int valToCheck = 0;
        int ans = ob.solve(inputArr,valToCheck);
        int dummy = -1;
    }
}
