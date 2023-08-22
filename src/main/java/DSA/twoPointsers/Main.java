package DSA.twoPointsers;

import DSA.modularMaths.pairSumModM;

// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        subArrayWithGivenSum ob = new subArrayWithGivenSum();
//        //int[] inpArr = new int[]{1,2,3,4,5};
//        int[] inpArr = new int[]{15,2,5,6,9};
//        int B= 7;
////        int[] inpArr = new int[]{1,1000000000};
////        int B= 1000000000;
////        int[] inpArr = new int[]{5,10,20,100,105};
////        int B= 110;
//        int[] ans = ob.solve(inpArr,B);

        pairsWithGivenDifference ob = new pairsWithGivenDifference();
//        int[] inputArr=new int[]{8, 12, 16, 4, 0, 20};
//        int valToCheck = 4;
//        int[] inputArr=new int[]{1,2};
//        int valToCheck = 0;
//        int[] inputArr=new int[]{8,5,1,10,5,9,9,3,5,6,6,2,8,2,2,6,3,8,7,2,5,3,4,3,3,2,7,9,6,8,7,2,9,10,3,8,10,6,5,4,2,3};
//        int valToCheck = 3;
        int[] inputArr=new int[]{1,2};
        int valToCheck = 0;
        int ans = ob.solve(inputArr,valToCheck);
        int dummy = -1;

    }
}